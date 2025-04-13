package GreedyAlgorithms;

// recursive soln(brute force)
// class Solution {
//     public boolean helper(String s, int index, int count)
//     {
//         int n = s.length();

//         if(count < 0 )
//         {
//             return false;
//         }
//         if(index == n)
//         {
//             return (count == 0);
//         }
//         if(s.charAt(index) == '(') 
//             return helper(s, index + 1, count + 1);
//         if(s.charAt(index) == ')')
//             return helper(s, index + 1, count - 1);
        
//         return helper(s, index + 1, count + 1) || helper(s, index + 1, count) || helper(s, index + 1, count);

//     }
//     public boolean checkValidString(String s) {
        
//         return helper(s, 0, 0);
//     }
// }

// dp approach

// class Solution {
//     public boolean checkValidString(String s) {
//         int n = s.length();
        
//         // dp[i] means whether it's possible to have i open parentheses at this index
//         boolean[] dp = new boolean[n + 1];
//         dp[0] = true; // We start with zero open parentheses
        
//         // Iterate over the string
//         for (int i = 0; i < n; i++) {
//             boolean[] nextDp = new boolean[n + 1];
//             for (int openCount = 0; openCount <= n; openCount++) {
//                 if (dp[openCount]) {
//                     // If we encounter '(', we increment the openCount
//                     if (s.charAt(i) == '(') {
//                         if (openCount + 1 <= n) {
//                             nextDp[openCount + 1] = true;
//                         }
//                     }
//                     // If we encounter ')', we decrement the openCount
//                     else if (s.charAt(i) == ')') {
//                         if (openCount - 1 >= 0) {
//                             nextDp[openCount - 1] = true;
//                         }
//                     }
//                     // If we encounter '*', it can act as '(', ')', or be ignored
//                     else if (s.charAt(i) == '*') {
//                         if (openCount + 1 <= n) {
//                             nextDp[openCount + 1] = true; // '*' as '('
//                         }
//                         if (openCount - 1 >= 0) {
//                             nextDp[openCount - 1] = true; // '*' as ')'
//                         }
//                         nextDp[openCount] = true; // '*' as ignored
//                     }
//                 }
//             }
//             dp = nextDp; // Move to the next state
//         }
        
//         // At the end, the only valid state is having 0 open parentheses
//         return dp[0];
//     }
// }


// optimal sol

class Solution {
    public boolean checkValidString(String s) {
        
        int min = 0;
        int max = 0;
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
           if(s.charAt(i) == '(')
           {
            min = min  +1;
            max = max + 1;
           }
           else if( s.charAt(i) == ')')
           {
            min = min - 1;
            max = max - 1;
           }
           else
           {
            min = min - 1;
            max = max  +1;
           }
           if(min <0) min = 0;
           if(max <0 ) return false;
        }
        return min == 0;
    }
}