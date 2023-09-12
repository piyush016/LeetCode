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
            if(fast == null || fast.next == null)
            return false;

            slow = slow.next; //slow should move 1
            fast = fast.next.next; //fast should move 2
            if(slow == fast) //If any point slow == fast, cycle exists.
            return true;
        }
        return false;
        
    }
}
