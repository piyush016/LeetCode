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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1); //Creatinh head for new linked list. While returning we will return from the next Node of the linked list.
        ListNode ptr1 = list1, ptr2 = list2, curr = newHead; //ptr1 for list1, ptr2 for list2 and curr to keep track for newHead last element

        while(ptr1 != null && ptr2 != null){ //If both are not equal to null then only we do the traversal
            if(ptr1.val < ptr2.val){ //if ptr1 value is less
               curr.next = ptr1; //then new linkedlist curr element should point there
               curr = curr.next; //this becomes the new the curr
               ptr1 = ptr1.next; //the 1st orginial linkedlist traversal moves forward
            }
            else{ //same logic but the 2nd original linkedlist 
                curr.next = ptr2;
                curr = curr.next;
                ptr2 = ptr2.next;
            }
        }

        if(ptr1 == null) //if 1st LL ends and there are elements in the 2nd LL
        curr.next = ptr2; //then just link the curr to the 1st element of the remaining LL

        if(ptr2 == null) //same logic
        curr.next = ptr1;

        return newHead.next; //return the head but after removing the -1 node which we added
    }
}