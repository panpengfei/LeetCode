
public class IntegerToRoman {
    public String intToRoman(int num) {
    	//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）   	
    	String result = "";
    	while(num!=0){
    		if(num/1000>0){
    			int count = num/1000;
    			for(int i=0;i<count;i++)result+="M";
    			num = num%1000;
    		}
    		else if(num/100==9){
    			result+="CM";
    			num = num%100;
    		}
    		else if(num/500>0){
    			result+="D";	
    			num = num%500;
    		}
    		else if(num/100>0){
    			int count = num/100;
    			if(count==4){
    				result+="CD";
    			}
    			else{
    				for(int i=0;i<count;i++)result+="C";			
    			}
    			num = num%100;
    		}
    		else if(num/10==9){
    			result+="XC";
    			num = num%10;
    		}
    		else if(num/50>0){
    			result+="L";	
    			num = num%50;
    		}
    		else if(num/10>0){
    			int count = num/10;
    			if(count==4){
    				result+="XL";
    			}
    			else{
    				for(int i=0;i<count;i++)result+="X";			
    			}
    			num = num%10;
    		}
    		else if(num==9){
    			result+="IX";
    			num = 0;
    		}
    		else if(num>=5){
    			result+="V";	
    			num = num%5;
    		}
    		else if(num>0){
    			if(num==4){
    				result+="IV";
    			}
    			else{
    				for(int i=0;i<num;i++)result+="I";			
    			}
    			num = 0;
    		}
    	}
    	
    	return result;
    }
}
