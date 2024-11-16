package GreedyAlgorithms;


//     public int minCoins(int coins[], int sum) {
//         // Your code goes here
//         int n = coins.length;
//         int count = 0;
//         Arrays.sort(coins);
        
//         for(int i = n - 1; i >= 0; i--)
//         {
//             while(sum >= coins[i])
//             {
//                 sum-= coins[i];
//                 count = count + 1;
//             }
//         }
//            if (sum > 0) {
//             return -1; 
//         }
//         return count;
//     }
// }

import java.util.Arrays;

class Solution {

    public int minCoins(int coins[], int sum) {
        int n = coins.length;

        // Initialize a DP array to store the minimum coins needed for each amount
        int[] dp = new int[sum + 1];

        // Fill the array with a large value (indicating impossible cases)
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: Zero sum requires zero coins
        dp[0] = 0;

        // Fill the DP table
        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[sum] is still Integer.MAX_VALUE, the sum cannot be formed
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}
