
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0,i=0,j=height.length-1;
        while(i<j){
        	if(height[i]==0){
        		i++;
        		continue;
        	}
        	if(height[j]==0){
        		j--;
        		continue;
        	}     	
        	int minIJ = height[i]<height[j]?height[i]:height[j];
        	if(minIJ*(j-i)>max)max = minIJ*(j-i);
        	if(minIJ==height[i])i++;
        	else j--;   	
        }
        return max;
    }
    
    public static void main(String[] args){
    	ContainerWithMostWater test  = new ContainerWithMostWater();
    	int[] height = {1,2,4,3};
    	System.out.println(test.maxArea(height));
    }
}
