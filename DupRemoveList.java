

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
class DupRemoveList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode cur = head;
        ListNode runner = head.next;
        while(cur.next!=null){
         if(runner==null){
             cur.next=runner;
             break;
         }else if(cur.val == runner.val){
             runner = runner.next;
         }else
         {
             cur.next = runner;
             cur=runner;
             runner = runner.next;
         }
        }
        return head;
    }
}
