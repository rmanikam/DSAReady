package BinaryTree;

// approach1
// class Solution {
//     TreeNode prev = null;
//     public void flatten(TreeNode root) {
//         if(root == null)
//         {
//             return;

//         }
//         flatten(root.right);
//         flatten(root.left);
//         root.right = prev;
//         root.left = null;
//         prev = root;
//     }
// }

//approach2

// class Solution {

//     public void flatten(TreeNode root) {
//         if(root == null) return;
//         Stack<TreeNode> st = new Stack<>();

//         st.push(root);
//         while(!st.isEmpty())
//         {
//             TreeNode curr = st.peek();
//             st.pop();
//             if(curr.right !=null)
//             {
//                 st.push(curr.right);
//             }
//             if(curr.left !=null)
//             {
//                 st.push(curr.left);
//             }
//             if(!st.isEmpty())
//             {
//                 curr.right = st.peek();
//             }
//             curr.left = null;

//         }

//     }
// }
//approach3

class Solution {

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        TreeNode prev = null;
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;

        }

    }
}