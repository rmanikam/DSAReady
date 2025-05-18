package SlidingWindow;


class Solution {
    public int TotalPairs(int[] nums, int k) {
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num - k)) {
                uniquePairs.add((num - k) + ":" + num);
            }
            if (seen.contains(num + k)) {
                uniquePairs.add(num + ":" + (num + k));
            }
            seen.add(num);
        }

        return uniquePairs.size();
    }
}

