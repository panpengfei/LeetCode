
public class ZigZagConversion {

	public String convert(String s, int nRows) {
        String result = "";
        if(s.length()<=nRows||nRows==1)return s;
        for(int i=0;i<nRows;i++){
        	//第一行与最后一行间隔为2*nRows-2
        	if(i==0||i==nRows-1){
        		int j = 0 ;
        		int gap = 2*nRows-2;
        		while(j*gap+i<s.length()){
        			result+=s.charAt(j*gap+i);
        			j++;
        		}
        	}
        	else{
        		int j=0,gap = 0;
            	while(i+gap<s.length()){
            		result+=s.charAt(i+gap);
            		if(j%2==1){   	
            			gap += 2*(i+1)-2;
            		}
            		else{
            			gap +=2*nRows-2*(i+1);
            		}
            		j++;
            	}
        	}
        	
        	     
        	
        	
        }
        
        return result;
		
		
    }
	
	
	public static void main(String[] args){
		ZigZagConversion test = new ZigZagConversion();
		System.out.println(test.convert("helloworld", 3));
		
	}
			
			
			
	
	
}
