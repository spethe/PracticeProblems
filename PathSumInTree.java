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
 Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Example 3:

Input: root = [1,2], targetSum = 0
Output: false
 
 */
class PathSumInTree {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        //Base Cases
        if(root==null){
            return false;
        }
        if(root.val==targetSum && isLeaf(root)){
            return true;
        }
      //Check For Path in Left subtree by altering the targetSum 
        boolean hps = hasPathSum(root.left, targetSum - root.val);
        if(hps == true) return true;
        else
          //If not found in Left; Check For Path in Right subtree by altering the targetSum 
            return hasPathSum(root.right,targetSum - root.val);
        
    }
    
    private boolean isLeaf(TreeNode leaf){
        if(leaf.left==null && leaf.right==null){
            return true;
        }else{
            return false;
        }
    }
}
