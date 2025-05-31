package BinarySearchTree;

class Solution {
    TreeNode first;
    TreeNode middle;
    TreeNode prev;
    TreeNode last;

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null && prev.val > root.val) {
            // first violation
            if (first == null) {
                first = prev;
                middle = root;
            }
            // 2nd violation
            else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if (first != null && last != null) {
            int t = first.val;
            first.val = last.val;
            last.val = t;
        } else if (first != null && middle != null) {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }
}
