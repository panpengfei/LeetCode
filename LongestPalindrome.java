
public class LongestPalindrome {

	 public String longestPalindrome(String s) {
	        
		 int start = 0,end = 0;
		 for(int i=0;i<s.length();i++){
			 int pre = i,post = i;
			 while(pre>=0&&post<=s.length()-1){
				 if(s.charAt(pre)==s.charAt(post)){
					 if(pre==0||post==s.length()-1)break;
					 else{
						 pre--;
						 post++; 
					 }	
				 }
				 else {
					 pre++;
					 post--; 
					 break;
				 }
			 }
			 if(post-pre>end-start){
				 start = pre;
				 end = post;
			 }		 
			 if(i==s.length()-1)break;
			 pre = i;
			 post = i+1;
			 while(pre>=0&&post<=s.length()-1){
				 if(s.charAt(pre)==s.charAt(post)){
					 if(pre==0||post==s.length()-1)break;
					 else{
						 pre--;
						 post++;
					 }
					 
				 }
				 else {
					 pre++;
					 post--; 
					 break;
				 }
			 }
			 if(post-pre>end-start){
				 start = pre;
				 end = post;
			 }
			 
		 }
		 
		 return s.substring(start, end+1);
	    }
	 
	 public static void main(String[] args){
		 LongestPalindrome test = new LongestPalindrome();
		 String s = "cba";
		 System.out.println(test.longestPalindrome(s));
		 
	 }
	 
	 
	 
	 
	 
}
