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

        while(fast != null && fast.next != null){ //If at any place fast or fast.next points to null that means linked list is straight

            slow = slow.next; //slow moving 1
            fast = fast.next.next; //fast moving 2
            if(slow == fast) //if slow and fast gets equal that means it has a cycle.
            return true;
        }
        return false;
        
    }
}