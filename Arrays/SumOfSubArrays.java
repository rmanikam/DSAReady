package Arrays;

// class Solution {
//     public long subarraySum(int[] arr) {
// code here
//         int n = arr.length;
//         if(n == 0)
//         {
//             return 0;
//         }
//         long total_sum = 0;
//         long MOD = 1000000007;
//         for(int i = 0; i < n; i++)
//         {
//              long sum = 0;
//             for(int j =i ; j < n; j++ )
//             {
//                 sum = sum + arr[j];
//                 total_sum = total_sum + sum;
//             }
//         }
//         return total_sum % MOD;
//     }
// }

// better

// User function Template for Java

// class Solution {
//     public long subarraySum(int[] arr) {
//       
//         int n = arr.length;
//         if(n == 0)
//         {
//             return 0;
//         }
//         long MOD = 1000000007;
//         long total_sum = 0;
//         for(int i = 0; i < n; i++)
//         {
//             long contribution = ((long)arr[i] * (i + 1) * (n-i))%MOD;
//             total_sum = (total_sum + contribution)%MOD;

//         }
//         return total_sum;
//     }
// }

// optimal

// User function Template for Java

class Solution {
    public long subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        long MOD = 1000000007;
        long total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum = (total_sum + ((long) arr[i] * (i + 1) * (n - i)) % MOD) % MOD;

        }
        return total_sum;
    }
}