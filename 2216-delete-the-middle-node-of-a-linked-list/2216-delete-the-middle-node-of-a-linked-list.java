/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        ListNode slow = head, fast = head, prev = null; //slow fast for 2 pointer method and prev to store previous element of the slow

        while(fast != null && fast.next != null){ //Traversing the slow and fast
            prev = slow; //Storing slow element to prev
            slow = slow.next; //Slow moves 1 step ahead
            fast = fast.next.next; //Fast moves 2 step ahead
        }

        prev.next = slow.next; //Previous element pointing to next of slow AND NOT slow.
        return head; //return head
    }
}