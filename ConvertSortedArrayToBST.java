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
 
 108. Convert Sorted Array to Binary Search Tree
Easy

3555

265

Add to List

Share
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */


class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        //Get the length of the array
        int len = nums.length;
        //If 0, return null
        if(len==0) return null;
        TreeNode root = null;
        //Base Case: if 1 then create a probable root node.
        if(len==1)  root = new TreeNode(nums[0]);
        else{
            //As it is a sorted array; get the middle index
            int mid = (int)Math.floor(len/2);
            //Create a root node for a subtree
            root = new TreeNode(nums[mid]);
            //Get root nodes for L & R subtrees and attach to as L & R child.
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,len));
        }
        return root;
    }
}
