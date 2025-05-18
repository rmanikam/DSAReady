package BackTracking;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return solve(0, s, set, dp);
    }

    private boolean solve(int start, String s, Set<String> wordDict, Boolean[] dp) {
        if (start == s.length()) return true;
        if (dp[start] != null) return dp[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && solve(end, s, wordDict, dp)) {
                return dp[start] = true;
            }
        }
        return dp[start] = false;
    }
}

