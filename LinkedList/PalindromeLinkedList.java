/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
    	if (head == null || head.next == null)
    		return true;
    	ListNode fast = head, slow = head, prev = null;
    	while (fast != null && fast.next != null) {
    		prev = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	prev.next = null;
    	slow = reverse(slow);
    	while (head != null && slow != null) {
    		if (head.val != slow.val)
    			return false;
    		head = head.next;
    		slow = slow.next;
    	}
        return true;
    }
    
    private ListNode reverse(ListNode head) {
    	ListNode prev = null, cur = head;
    	while (cur != null) {
    		ListNode next = cur.next;
    		cur.next = prev;
    		prev = cur;
    		cur = next;
    	}
    	return prev;
    }
}