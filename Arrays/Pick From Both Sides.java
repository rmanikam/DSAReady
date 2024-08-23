
package Arrays;

import java.util.ArrayList;

class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        
        // Step 1: Calculate the sum of the first B elements from the left
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A.get(i);
        }
        
        // This will store the maximum sum we can achieve
        int maxSum = currentSum;
        
        // Step 2: Try replacing elements from the left with elements from the right
        // We start replacing one by one from the right and subtracting from the left
        for (int i = 0; i < B; i++) {
            currentSum -= A.get(B - 1 - i);  // Remove one element from the left
            currentSum += A.get(n - 1 - i);  // Add one element from the right
            maxSum = Math.max(maxSum, currentSum);  // Track the maximum sum
        }
        
        return maxSum;
    }
}