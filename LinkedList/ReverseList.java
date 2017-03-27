/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseList {
    
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        return head;
        // iterative way
        // if (!head) return;
        // Node* prev = NULL;
        // Node* curr = head;
        // while (curr) {
        //      Node* next = curr->next;
        //      curr->next = prev;
        //      prev = curr;
        //      curr = next;
        // }
        // head = prev;
        
        //get second node    
        ListNode second = head.next;
        //set first's next to be null
        head.next = null;
     
        ListNode rest = reverseList(second);
        second.next = head;
     
        return rest;
    }
}