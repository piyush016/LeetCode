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
 // Slow fast pointer approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast.next != null){
            if(fast.next.next == null){ // In even number list, they want ()n/2 + 1)th element
                slow = slow.next;
                break;
            }
            //Otherwise normal traversal
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}