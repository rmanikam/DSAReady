package BinaryTree;

// approach1

// class Solution {
//     int count;
//     public void inorder(TreeNode root)
//     {
//         if(root == null)
//         {
//             return;
//         }
//         count++;
//         inorder(root.left);
//         inorder(root.right);

//     }
//     public int countNodes(TreeNode root) {

//     inorder(root);
//     return count;

//     }
// }

//approach2

class Solution {

    public int heightOfLeft(TreeNode root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;

    }

    public int heightOfRight(TreeNode root) {
        int count = 0;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;

    }

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;

        }
        int lh = heightOfLeft(root);
        int rh = heightOfRight(root);
        if (lh == rh) {
            return ((2 << (lh)) - 1);
        }
        return 1 + countNodes(root.left) + countNodes(root.right);

    }
}