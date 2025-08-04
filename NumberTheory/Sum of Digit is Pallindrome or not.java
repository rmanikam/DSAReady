package NumberTheory;
// User function Template for Java

// class Solution {

//     int isDigitSumPalindrome(int n) {
// code here
//         int sum = 0;
//         int k = n;
//         while (k != 0) {
//             sum = sum + k % 10;
//             k = k / 10;
//         }
//         int j = sum;
//         int r = 0;
//         while (j != 0) {
//             r = r * 10 + j % 10;
//             j = j / 10;
//         }
//         if (sum == r) {
//             return 1;
//         } else {
//             return 0;
//         }
//     }
// }

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            sum = sum + a;
            n = n / 10;
        }
        int x = sum;
        int ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        if (ans == sum) {
            return true;
        } else {
            return false;
        }
    }
}