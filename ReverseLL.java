/**
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        //If LL is empty or only 1 node
        if (head==null || head.next == null){
            return head;
        }
       //Use 3 pointers plus head and initialize accordingly.
       ListNode cur,prev,runner;
       cur=head;
       prev = head.next;
       runner = prev.next;
       //Iterate till last element.
       while(runner != null){
           prev.next = head;
           cur.next = runner;
           head = prev;
           prev = runner;
           runner = runner.next;
        }
        //Take care of last element or an LL with 2 nodes.
        prev.next = head;
        head=prev;
        cur.next=null;
    return head;
    }
}
