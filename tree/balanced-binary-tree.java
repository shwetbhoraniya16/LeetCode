class Solution {
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftht = height(root.left);
        int rightht = height(root.right);
        return Math.max(leftht, rightht) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if(Math.abs(leftheight - rightheight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}