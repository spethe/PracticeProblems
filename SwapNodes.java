

/**
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

 

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Given 1->2->3, you should return the list as 2->1->3.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapNodes {
    public ListNode swapPairs(ListNode head) {
      //Needs 3 ListNode pointers
        ListNode runner;
        ListNode curr = head;
        ListNode prev = head;
        //Check Edge condition
        if(head==null || head.next == null) return head;
        //Fix the head, as this will always be the case.
        head = head.next;
        //O(n) loop
        while(curr!=null){
            runner=curr.next;
            if(runner==null) break;
            curr.next=runner.next;
            runner.next=curr;
            if(prev!=curr){
                prev.next=runner;
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
