import java.util.Arrays;


public class LengthOfLongestSubstring {

	
	  public int lengthOfLongestSubstring(String s) {
	      int max = 0;
	      int start = 0;
	      int[] letters = new int[256]; 
	      Arrays.fill(letters, -1);  
	      for(int i=0;i<s.length();i++){
	    	  if(letters[s.charAt(i)]!=-1){
	    		  if(start<=letters[s.charAt(i)]){
	    			  if(i-start>max)max = i-start;
	    			  start = letters[s.charAt(i)]+1;   	
	    		  }	    		  
	    		  else {
	    			  if(i-start+1>max)max = i-start+1;
	    		  }
	    	  }
	    	  else{
	    		  if(i-start+1>max)max = i-start+1;
	    	  }
	    	  letters[s.charAt(i)] = i;	    	  
	      }	  
		  
		  return max;
	    }
	  
	  
	  public static void main(String[] args){
		  LengthOfLongestSubstring test =  new LengthOfLongestSubstring();
		  String s = "ctclemwwlexnkvwizzoyctqlnzxoetyioavsorrbvoqflpqlqgluzdgoefckaatpdohtgaxdqnlceb";
		  System.out.println(test.lengthOfLongestSubstring(s));
	  }
}
