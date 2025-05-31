package BinaryTree;

class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean left = isSumTree(root.left);
        boolean right = isSumTree(root.right);

        if (left && right) {
            int sum = 0;
            if (root.left != null) {
                sum += root.left.data;
            }
            if (root.right != null) {
                sum += root.right.data;
            }
            if (root.data == sum) {
                root.data += sum;
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}
