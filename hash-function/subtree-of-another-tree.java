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
class Solution {
    public boolean isidentical(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == q;
        }
        return p.val == q.val && isidentical(p.left, q.left) && isidentical(p.right, q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
       if(root == null || subroot == null){
         return root == subroot;
       }
       if(root.val == subroot.val && isidentical(root, subroot)){
        return true;
       }
       return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
}