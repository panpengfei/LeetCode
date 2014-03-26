
public class AToI {
	public int atoi(String str) {
		if(str==null||str.equals(""))return 0;
		int maxInt = 2147483647;
		int minInt = -2147483648;
        int result = 0;    
        int sign = 1;
        int i = 0;
        while(str.charAt(i)<'0'||str.charAt(i)>'9'){
        	char temp = str.charAt(i);
        	if(temp==' ')i++;
        	else if(temp=='-'||temp=='+'){
        		if(i+1<str.length()&&str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'){
        			if(temp=='-')sign = -1;
        			i++;
        		}
        		else return 0;
        	}
        	else return 0;
        }
        
        for(;i<str.length();i++){  
        	if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        		if(sign>0&&(maxInt-(str.charAt(i)-'0'))/10<result)return maxInt;
        		else if(sign<0&&(minInt+(str.charAt(i)-'0'))/10>-1*result){
        			System.out.println((minInt+(str.charAt(i)-'0'))/10);
        			System.out.println(-1*result);
        			return minInt;
        		}
        		else {
        			result = result*10+(str.charAt(i)-'0');
        		}
        		
        	}
 
        	else return result*sign;

        }
            
        return result*sign;
		
    }
	
	public static void main(String[] args){
		AToI test = new AToI();
		System.out.println(test.atoi("2147483642"));
	}
	
}
