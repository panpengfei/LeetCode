
public class ReverseInteger {
	public int reverse(int x) {
        int result = 0;
        int sign = 1;
        if(x<0){
        	x = -1*x;
        	sign = -1;
        }
        while(x!=0){
        	result = result*10+x%10;
        	x = x/10;
        }
        
        return result*sign;
    }
	
	public static void main(String[] args){
		ReverseInteger test = new ReverseInteger();
		System.out.println(test.reverse(-123));
	}
}
