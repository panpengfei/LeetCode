

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode prePart = null;
    	ListNode curr = head;
    	int index = 1;
        while(index<m-1){
        	curr = curr.next;
        	index++;
        }
        if(m!=1){
        	prePart = curr;
        	curr = curr.next;
        	index++;
        }
        ListNode pre = null;
        ListNode post = curr.next;
        while(post!=null&&index<n){
        	curr.next=pre;
        	pre = curr;
        	curr = post;
        	post = post.next;
        	index++;
        }
        curr.next=pre;
        if(post!=null){
        	ListNode tempNode = curr;
        	while(tempNode.next!=null)tempNode = tempNode.next;
        	tempNode.next = post;
        }
        if(prePart==null)return curr;
        else {
        	prePart.next = curr;
        	return head;
        }
            
    }
}
