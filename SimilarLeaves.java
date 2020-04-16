/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SimilarLeaves {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ll1 = new LinkedList<Integer>();
        List<Integer> ll2 = new LinkedList<Integer>();
        //dfs
        traverse(root1,ll1);
        traverse(root2,ll2);
        //compare 2 Linked Lists
        return ll1.equals(ll2);
    }
    
    private void traverse(TreeNode root, List<Integer> ll){
        //IF LEAF: then add to LinkedList
        if(root.left == null && root.right == null){
            ll.add(root.val);
            return;
        }
        //Otherwise Traverse
        if(root.left != null)
            traverse(root.left,ll);
        if(root.right != null)
            traverse(root.right,ll);
    }
}
