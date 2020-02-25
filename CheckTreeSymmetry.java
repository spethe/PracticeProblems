/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
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
class CheckTreeSymmetry {
    public boolean checkSymm(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) return true;
        else if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return checkSymm(left.left,right.right) && checkSymm(left.right,right.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymm(root.left,root.right);
    }
}
