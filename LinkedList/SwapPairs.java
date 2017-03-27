/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapPairs {
    
    public static ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode p = h;
        while(p!=null && p.next!=null && p.next.next!=null){
            ListNode t1 = p;
            p = p.next;
            t1.next = p.next;
            
            ListNode t2 = p.next.next;
            p.next.next = p;
            p.next = t2;
        }
        return h.next;
    }
}