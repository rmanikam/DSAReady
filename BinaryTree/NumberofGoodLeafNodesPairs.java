package BinaryTree;

class Solution {
    int noOfGoodPairs;

    List<Integer> dfs(TreeNode root, int distance) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<Integer> leaf = new ArrayList<>();
            leaf.add(1);
            return leaf;
        }
        List<Integer> left = dfs(root.left, distance);
        List<Integer> right = dfs(root.right, distance);
        for (int a : left) {
            for (int b : right) {
                if (a + b <= distance) {
                    noOfGoodPairs++;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int k : left) {
            if (k + 1 <= distance) {
                res.add(k + 1);
            }
        }
        for (int m : right) {
            if (m + 1 <= distance) {
                res.add(m + 1);
            }
        }
        return res;
    }

    public int countPairs(TreeNode root, int distance) {
        noOfGoodPairs = 0;
        dfs(root, distance);
        return noOfGoodPairs;
    }
}
