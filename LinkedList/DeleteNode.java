/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNode {

    public static void deleteNode(ListNode node) {
        ListNode actualNode = node;
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null)
                node.next = null;
            else
                node = node.next;
        }
    }
}