class Solution {
public ListNode reverseList(ListNode head) {
ListNode current=head;
ListNode prev=null;
ListNode temp=null;

    while(current!=null){
        temp=current.next;
        current.next=prev;
        prev=current;
        current=temp;
       
     }
    return prev;
}
}
