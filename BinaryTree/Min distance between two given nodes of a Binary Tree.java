package BinaryTree;

class MinDistance {
    int ans; // <-- class-level variable

    int rec(Node root, int a, int b) {
        if (root == null) {
            return 0;
        }

        int left = rec(root.left, a, b);
        int right = rec(root.right, a, b);

        if (root.data == a || root.data == b) {
            if (left == 0 && right == 0) {
                return 1;
            } else if (left > 0) {
                ans = left;
            } else if (right > 0) {
                ans = right;
            }
            return 1;
        } else {
            if (left > 0 && right > 0) {
                ans = left + right;
                return 0;
            } else if (left > 0) {
                return left + 1;
            } else if (right > 0) {
                return right + 1;
            }
        }

        return 0;
    }

    int findDist(Node root, int a, int b) {
        ans = 0; // initialize before recursion
        rec(root, a, b);
        return ans;
    }
}
