/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0;
        int lenB = 0;
        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
        }
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
        }
        int dist = lenA > lenB? lenA-lenB : lenB-lenA;
        if(lenA > lenB){
            while(dist > 0){
                headA = headA.next;
                dist--;
            }
        } else{
            while(dist > 0){
                headB = headB.next;
                dist--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}