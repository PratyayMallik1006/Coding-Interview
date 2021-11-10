//Floyd’s Tortoise and Hare Algorithm
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//T:O(n)
//S:O(1)
public class ListDetectCycle_Fastslow {
	public ListNode detectCycle(ListNode head) {
		if(head==null) return head;
        
        ListNode fast=head;//hare
        ListNode slow=head;//tortoise
        
        do{
            if(fast==null||fast.next==null) return null;
            slow=slow.next;//1 step
            fast=fast.next.next;//2 step
        }while(slow!=fast);
        
        ListNode findStart=head;
        while(slow!=findStart){
            findStart=findStart.next;
            slow=slow.next;
        }
        return findStart;
	}
}
