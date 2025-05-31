package BinaryTree;

class Solution {
    public int helper(TreeNode root, int ans, int maxValue) {
        if (root == null) {
            return 0;
        }
        int rootAns = 0;
        if (root.val >= maxValue) {
            maxValue = root.val;
            rootAns = 1;
        }
        int lAns = helper(root.left, ans, maxValue);
        int rAns = helper(root.right, ans, maxValue);
        return lAns + rAns + rootAns;
    }

    public int goodNodes(TreeNode root) {
        return helper(root, 0, Integer.MIN_VALUE);
    }
}