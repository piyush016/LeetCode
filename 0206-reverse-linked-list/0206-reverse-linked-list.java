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
    public ListNode reverseList(ListNode head) {
        ListNode prev= null, curr = head, temp=null; //prev is previous than curr. curr will be in between prev and temp. temp to be ahead of curr.

        if(curr == null) //corner case
        return null;
        
        while(curr != null){   //Iterate till the current does not reach the NULL
            temp = curr.next; //making temp ahead of curr
            curr.next = prev; //linking the node from curr to prev
            prev = curr; //making the element to in the first of the reverse linked list

            curr = temp; //to make curr move forward for next iteration
        }
        head = prev; //making head as the last element

        return head;

        
    }
}