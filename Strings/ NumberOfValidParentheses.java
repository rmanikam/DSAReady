class NumberOfValidParenthesis {
    // brute force
    static int helper(int left, int right, int[] ans) {

        // If no more left and right parentheses
        // are remaining, a valid combination is found
        if (left == 0 && right == 0) {
            ans[0]++;
            return ans[0];
        }

        // If more right parentheses than left, return
        // (invalid state)
        if (left > right) {
            return 0;
        }

        // Try adding a left parenthesis if available
        if (left > 0) {
            helper(left - 1, right, ans);
        }
    
        // Try adding a right parenthesis if available
        if (right > 0) {
            helper(left, right - 1, ans);
        }

        return ans[0];
    }

    // Function to count valid parentheses arrangements of
    // length n
    static int findWays(int n) {
    
        // If n is odd, no valid arrangements
        // possible
        if (n % 2 == 1)
            return 0;
        int[] ans = { 0 };
        return helper(n / 2, n / 2, ans);
    }

    public static void main(String[] args) {
        int n = 6;
        int res = findWays(n);
        System.out.println(res);
    }
}