
public class AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
		
		 ListNode root = new ListNode(0);
		 ListNode result = null;
		 int addToNext = 0;
		 while(l1!=null&&l2!=null){			
			 int current = (l1.val+l2.val+addToNext)%10;
			 addToNext = (l1.val+l2.val+addToNext)/10;
			 if(result==null){
				 result = new ListNode(current);
				 root.next = result;
			 }
			 else{
				 result.next =  new ListNode(current);
				 result = result.next;	
			 }
			
			 l1 = l1.next;
			 l2 = l2.next;
		 }
		 while(l1!=null){
			 int current = (l1.val+addToNext)%10;
			 addToNext = (l1.val+addToNext)/10;
			 if(result==null){
				 result = new ListNode(current);
				 root.next = result;
			 }
			 else{
				 result.next =  new ListNode(current);
				 result = result.next;	
			 }
			
			 l1 = l1.next;
		 }
		 while(l2!=null){
			 int current = (l2.val+addToNext)%10;
			 addToNext = (l2.val+addToNext)/10;
			 if(result==null){
				 result = new ListNode(current);
				 root.next = result;
			 }
			 else{
				 result.next =  new ListNode(current);
				 result = result.next;	
			 }
			 l2 = l2.next;
		 }
		 
		 if(addToNext!=0){
			 result.next =  new ListNode(addToNext);
		 }
		 	 
		 return root.next;
		 
	    }
	 
	 
	 public static void main(String[] args){
		 AddTwoNumbers test = new AddTwoNumbers();
		 ListNode l1 = new ListNode(1);
		 l1.next = new ListNode(8);
		 ListNode l2 = new ListNode(0);
		 System.out.println(test.addTwoNumbers(l1, l2).next.val);
	 }
	 
}
