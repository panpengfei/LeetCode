
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if(s==null)return p==null;
        if(s.equals("")){
        	if(p.equals(""))return true;
        	else{
        		if(p.length()%2==1)return false;
        		else{
        			for(int i=1;i<p.length();i+=2){
        				if(p.charAt(i)!='*')return false;
        			}
        			return true;
        		}
        	}
        }
        if(p==null||p.equals(""))return s.equals(p);
        if(p.length()==1){
        	if(s.length()!=1)return false;
        	return s.charAt(0)==p.charAt(0)||p.charAt(0)=='.';
        }
        else{
        	if(p.charAt(1)!='*'){
        		if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')return isMatch(s.substring(1),p.substring(1));
        		return false;
        	}
        	else{
        		int i=0;
        		while(i<s.length()&&(s.charAt(i)==p.charAt(0)||p.charAt(0)=='.')){
        			if(isMatch(s.substring(i+1),p.substring(2)))return true;
        			i++;
        		}
        		
        		return isMatch(s,p.substring(2));
        	}
        	
        }
   
    }
    
    public static void main(String[] args){
    	RegularExpressionMatching test = new RegularExpressionMatching();
    	System.out.println(test.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}
