package BinarySearchTree;

class Solution {
    int ans;

    public int[] bst(TreeNode root) {
        if (root == null) {
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };
        }
        int[] leftSubtree = bst(root.left);
        int[] rightSubtree = bst(root.right);

        if (leftSubtree[1] < root.val && root.val < rightSubtree[0]) {
            int currSum = leftSubtree[2] + rightSubtree[2] + root.val;
            ans = Math.max(ans, currSum);
            int minValue = Math.min(root.val, leftSubtree[0]);
            int maxValue = Math.max(root.val, rightSubtree[1]);
            return new int[] { minValue, maxValue, currSum };
        }
        int maxSum = Math.max(leftSubtree[2], rightSubtree[2]);
        return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, maxSum };
    }

    public int maxSumBST(TreeNode root) {
        ans = 0;
        bst(root);
        return ans;
    }
}
