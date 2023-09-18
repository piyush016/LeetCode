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

 //Logic: Divide the Linked List in 2 parts using slow and fast pointer.
        // Partion the linked list using the slow pointer in the between.
        // Reverse the 2nd linked list formed after the partition.
        // Now link 1st with 1st and so on.

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) //Base case
        return;

        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){ //Slow fast pointer
            slow = slow.next; //Slow moves 1
            fast = fast.next.next; //Fast moves 2
        }

        ListNode head2 = slow.next; //This forms the 2nd LL
        slow.next = null; //Disconnecting the 1st LL from 2nd to create partition

        ListNode head1 = head; //1st LL

        head2 = reverse(head2); //Reversing 2nd LL

        ListNode curr = new ListNode(-1); //Dummy head

        while(head1 != null){
            ListNode temp = head1.next; //Because we break link of 1st LL to join 2nd LL so we store next node of 1st LL as temp
            curr.next = head1; //Node from 1st LL is connected
            head1.next = head2; //Node from 1st LL connected to node of 2nd LL
            curr = head2; //Newly formed LL current moves to the end of the LL
            head1 = temp; //Head of 1st LL moves to next node since present is already joined

            if(head2 != null) //Checking if head2 is null or not since we dont check that in while loop
            head2 = head2.next; //Head of 2nd LL moves to next node since present node is already joined 
        }
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}