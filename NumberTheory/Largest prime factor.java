package NumberTheory;

//User function Template for Java

// class Solution{
//     static long largestPrimeFactor(int N) {
// code here
//         int ans = 0;
//         double m = Math.sqrt(N);
//         for(int i = 2; i <= m; i++)
//         {
//             if(N%i == 0)
//             {
//                 ans = Math.max(ans, i);
//                 while(N%i == 0)
//                 {
//                   N=N/i;
//                 }
//             }
//         }
//         if(N > 1)
//         {
//             ans = N;
//         }
//         return ans;
//     }
// }

class Solution {
    static int largestPrimeFactor(int n) {
        // code here

        int i = 2;
        int largest = 1;
        while (n != 1) {
            while (n % i == 0) {
                n = n / i;
                largest = i;
            }

            i++;
        }
        return largest;
    }
}