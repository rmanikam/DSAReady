package BinarySearchTree;

import java.util.*;

class Solution {
    List<List<Long>> table = new ArrayList<>();

    public long dfs(int[] nums, long mod) {
        int n = nums.length;
        if (n <= 2)
            return 1;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[0])
                left.add(nums[i]);
            else
                right.add(nums[i]);
        }

        // Convert List<Integer> to int[] manually
        int[] leftArr = new int[left.size()];
        for (int i = 0; i < left.size(); i++) {
            leftArr[i] = left.get(i);
        }

        int[] rightArr = new int[right.size()];
        for (int i = 0; i < right.size(); i++) {
            rightArr[i] = right.get(i);
        }

        long leftRes = dfs(leftArr, mod);
        long rightRes = dfs(rightArr, mod);

        int left_len = left.size();
        return (((table.get(n - 1).get(left_len) * leftRes) % mod) * rightRes) % mod;
    }

    public int numOfWays(int[] nums) {
        long mod = (long) 1e9 + 7;
        int n = nums.length;

        // Build Pascal’s Triangle
        for (int i = 0; i <= n; i++) {
            List<Long> row = new ArrayList<>();
            row.add(1L);
            for (int j = 1; j < i; j++) {
                long val = (table.get(i - 1).get(j - 1) + table.get(i - 1).get(j)) % mod;
                row.add(val);
            }
            if (i > 0)
                row.add(1L);
            table.add(row);
        }

        long ans = dfs(nums, mod);
        return (int) ((ans - 1 + mod) % mod); // subtracting the original sequence
    }
}
