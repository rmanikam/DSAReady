package NumberTheory;

// class Solution {
//     public int smallestEvenMultiple(int n) {
//          int y = 2;
//          int ans = 0;
//          for(int i = 1; i <= 150; i++)
//          {
//             int j;
//             for(j = 1; j <= 150; j++)
//             {
//                 if( y * j == n * i)
//                 {
//                    ans = y * j;
//                    break;
//                 }
//             }
//             if( y * j == n * i)
//             {
//                 ans = y * j;
//                 break;
//             }
//          }
//          return ans;
//     }
// }

class Solution {
    public int smallestEvenMultiple(int n) {
        int k = 2;
        int i = 2;
        while (k > 0) {
            if (k % n == 0 && k % i == 0) {
                break;
            }
            k++;
        }
        return k;
    }
}