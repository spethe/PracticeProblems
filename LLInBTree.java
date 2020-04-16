/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LLInBTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        ListNode cur = head;
        TreeNode t = root;
        return checkPath(cur,t);
    }
    
    private boolean checkPath(ListNode cur, TreeNode t){
        //If we have already reach leaf node and not found path; return false.
        if(t == null) return false;
        //If we have reached end of LL and still both nodes are of equal value; return true;
        if(cur.next == null && (cur.val == t.val)){
            return true;
        }
        //If we haven't reached the end of LL but node values are equal check next node in subtree.
        if(cur.val == t.val){
            return checkPath(cur.next, t.left) || checkPath(cur.next,t.right);
        //Else: just check for same node in next subtree
        }else{
            return checkPath(cur,t.left) || checkPath(cur,t.right);
        }
        
    }
}
