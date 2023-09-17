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

 //Divide and conquer method
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length; //Finding the length list
        int interval = 1; //Interval stores the value to sort the number of times

        if(len == 0)
        return null;

        while(interval < len){ // O(logk)
            for(int i = 0; i+interval < len; i = i + interval * 2){ // O(n) 
                lists[i] = mergeTwoSortedLists(lists[i], lists[i + interval]);
            }
            interval = 2*interval; 
        }

        return lists[0];
    }

    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){
        ListNode head = new ListNode(-1); //Creating fake head
        ListNode curr = head; //Current to point at fake head

        //Same logic of merging 2 linked list
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        if(list1 == null)
        curr.next = list2;

        if(list2 == null)
        curr.next = list1;

        return head.next; //Returning the Linked List after the fake head
    }
}