class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfsSearch(cloned, target);
    }
    
    private TreeNode dfsSearch(TreeNode root, TreeNode target){
            if(root.val == target.val){
                return root;
            }
            if(root.left != null){
                TreeNode a =  dfsSearch(root.left,target);
                if (a != null) return a;
            }
            if(root.right != null){
               TreeNode a = dfsSearch(root.right,target);
                return a;  
            }
            return null;
        }
}
