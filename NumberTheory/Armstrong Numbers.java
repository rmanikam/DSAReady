package NumberTheory;

// User function Template for Java
// class Solution {
//     static String armstrongNumber(int n) {
//         // code here

//            int sum = 0;
//         int m = n;
//         while(n > 0){
//             int k = n % 10;
//             sum = sum + k * k * k;
//             n = n / 10;
//         }
//         if(m == sum)
//         {
//             return "true";
//         }
//         else
//         {
//             return "false";
//         }
//     }
// }

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int y = n;
        int a = 0;
        int sum = 0;
        while (y != 0) {
            a = y % 10;
            sum = sum + a * a * a;
            y = y / 10;

        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}