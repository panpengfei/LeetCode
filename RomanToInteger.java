
public class RomanToInteger {
    public int romanToInt(String s) {
    	//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000)
    	int result = 0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='M')result+=1000;
    		else if(s.charAt(i)=='D')result+=500;
    		else if(s.charAt(i)=='C'){
    			if(i+1<s.length()){
    				int flag = 0;
    				if(s.charAt(i+1)=='M'){
    					result+=900;
    					flag=1;
    				}
    				if(s.charAt(i+1)=='D'){
    					result+=400;
    					flag=1;
    				}
    				if(flag==1)i++;
    				else result+=100;
    			}
    			else result+=100;
    		}
    		else if(s.charAt(i)=='L')result+=50;
    		else if(s.charAt(i)=='X'){
    			if(i+1<s.length()){
    				int flag=0;
    				if(s.charAt(i+1)=='C'){
    					result+=90;
    					flag=1;
    				}
    				if(s.charAt(i+1)=='L'){
    					result+=40;
    					flag=1;
    				}
    				if(flag==1)i++;
    				else result+=10;
    			}
    			else result+=10;
    		}
    		else if(s.charAt(i)=='V')result+=5;
    		else if(s.charAt(i)=='I'){
    			if(i+1<s.length()){
    				int flag = 0;
    				if(s.charAt(i+1)=='X'){
    					result+=9;
    					flag=1;
    				}
    				if(s.charAt(i+1)=='V'){
    					result+=4;
    					flag=1;
    				}
    				if(flag==1)i++;
    				else result+=1;
    			}
    			else result+=1;
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args){
    	RomanToInteger test = new RomanToInteger();
    	System.out.println(test.romanToInt("MCMXCIX")); 
    }
    
    
}
