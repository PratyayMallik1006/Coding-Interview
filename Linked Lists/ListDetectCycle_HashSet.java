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
//S:O(n)
public class ListDetectCycle_HashSet {
	public ListNode detectCycle(ListNode head) {
		Set<ListNode> seen = new HashSet<>();

		while (head != null) {
			if (head.next == null) return null;
			if (seen.contains(head.next)) return head.next;
			seen.add(head);
			head = head.next;
		}

		return head;
	}
}