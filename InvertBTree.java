/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
 Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
*/


class InvertBTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    private void invert(TreeNode root){
        if (root == null) return;
        if(root.left == null && root.right == null) return;
        TreeNode tempTn = root.left;
        root.left = root.right;
        root.right = tempTn;
        invert(root.left);
        invert(root.right);
    }
}
