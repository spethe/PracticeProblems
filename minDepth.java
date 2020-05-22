 public int minDepth(TreeNode root) {
        //Terminating condition
        if (root == null){
            return 0;
        }
        //If leaf? 
        if(root.left == null && root.right == null){
            return 1;
        }
        //Calculate L & R tree depth
        int l = 1 + minDepth(root.left);
        int r = 1 + minDepth(root.right);
        //If no L or R tree...
        if(l==1) return r;
        if(r==1) return l;
        //Normally...
        return (Math.min(l,r));
}
