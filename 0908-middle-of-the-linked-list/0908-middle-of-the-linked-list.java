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

asdfasfd
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast.next != null){
            if(fast.next.next == null){
                slow = slow.next;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}