import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {

		int[] result = new int[2];
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int halfCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]*2==target){
				result[halfCount] = i+1;
				halfCount++;
			}
			else numMap.put(target - numbers[i], numbers[i]);
			if(halfCount==2)return result;
		}
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numMap.get(numbers[i])==null)continue;
			if (numMap.get(numbers[i]) == target - numbers[i]) {
				result[count] = i + 1;
				count++;
			}
			if (count == 2)
				break;
		}
		return result;
	}
	
	public static void main(String[] args){
		TwoSum twoSum = new TwoSum();
		int[] source = {3,2,4};
		int[] result = twoSum.twoSum(source, 6);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
