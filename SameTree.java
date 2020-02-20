/*
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame=true;
        List<Integer> pList = new ArrayList<Integer>();
        List<Integer> qList = new ArrayList<Integer>();
        postOrder(p,pList);
        postOrder(q,qList);
        if(pList.size() != qList.size()) {
            return false;
        }
        ListIterator<Integer> piterator = pList.listIterator();
        ListIterator<Integer> qiterator = qList.listIterator();
        
        while(piterator.hasNext()){
            Integer pval = piterator.next();
            Integer qval = qiterator.next();
            if( pval == null && qval == null){
                continue;
            } else if(pval == null && qval != null) {
                isSame=false;
                break;
            }else if(pval!=null && qval == null){
                isSame=false;
                break;
            }
            else if(!pval.equals(qval)){
               isSame=false;
               break; 
            }
        }
        return isSame;
    }
    
    private void postOrder(TreeNode node, List<Integer> tlist){
        if(node == null){
          tlist.add(null);
          return;  
        }
        postOrder(node.left,tlist);
        postOrder(node.right,tlist);
        tlist.add(Integer.valueOf(node.val));
    }
}
