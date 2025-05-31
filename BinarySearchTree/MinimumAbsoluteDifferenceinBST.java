package BinarySearchTree;

// approach 1
// class Solution {
//     int minDiff = Integer.MAX_VALUE;
//     Integer prev = null;
//     public int getMinimumDifference(TreeNode root) {

//       if(root == null)
//       {
//         return minDiff;
//       }
//       getMinimumDifference(root.left);

//       if(prev!= null)
//       {
//         minDiff = Math.min(minDiff, root.val - prev);
//       }
//       if(root != null)
//       {
//         prev = root.val;
//       }
//       getMinimumDifference(root.right);

//       return minDiff;

//     }
// }

// approach2

class Solution {
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;

        inOrder(root.right);
    }
}