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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftht = minDepth(root.left);
        int rightht = minDepth(root.right);
        if(leftht == 0){
            return rightht + 1;
        }
        if(rightht == 0){
            return leftht + 1;
        }
        return Math.min(leftht, rightht) + 1;
    }
}