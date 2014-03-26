
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int divisor = 1;
        while(x/divisor>=10)divisor*=10;
        while(x>=10){
        	if(x/divisor!=x%10)return false;        	
        	x = (x%divisor)/10;
        	//头尾各去一位i，division需要缩减一百倍
        	divisor /= 100;    	
        }
        
        return true;
    	
    }
    
    public static void main(String[] args){
    	PalindromeNumber test = new PalindromeNumber();
    	System.out.println(test.isPalindrome(10));
    	
    }
}
