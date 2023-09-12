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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) // 0 or 1 node. Means linked list has no cycle
        return false;

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){ 
        
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            return true;
        }
        return false;
        
    }
}