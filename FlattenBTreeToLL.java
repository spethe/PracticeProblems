/*
Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class FlattenBTreeToLL {

    private boolean isLeaf(TreeNode node){
        if(node==null) return false;
        if(node.left==null && node.right==null) return true;
        else return false;
    }
    //Last Operation
    private void pivot(TreeNode root){
        if(root.left==null) return;
        TreeNode cur = root.left;
        while(cur.right != null){
            cur=cur.right;
        }
        cur.right=root.right;
        root.right=root.left;
        root.left=null;
    }
    //Recursive Operation
    public void flatten(TreeNode root) {
        if(root==null)return;
        if(isLeaf(root)) return;
        if(isLeaf(root.left) && root.right==null){
            root.right=root.left;
            root.left=null;
            return;
        }
        if(isLeaf(root.right) && root.left == null) return;
        if(isLeaf(root.left) && isLeaf(root.right)){
            root.left.right=root.right;
            root.right=root.left;
            root.left=null;
            return;
        }
        if(root.left!=null)
            flatten(root.left);
        if(root.right!=null)
            flatten(root.right);
        pivot(root);
    }
}
