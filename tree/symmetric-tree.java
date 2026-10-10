class Solution {
    public boolean isIdentical(TreeNode left, TreeNode right) {

        // Base case: both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // One node is null, but the other is not
        if (left == null || right == null) {
            return false;
        }

        // Check values and compare mirrored subtrees
        if (left.val != right.val) {
            return false;
        }

        return isIdentical(left.left, right.right) &&
               isIdentical(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isIdentical(root.left, root.right);
    }
}