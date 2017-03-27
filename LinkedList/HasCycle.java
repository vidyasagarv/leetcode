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
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return false;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p1!=null&&p2!=null&&p2.next!=null){
            if(p1.val==p2.val)
            return true;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }
}