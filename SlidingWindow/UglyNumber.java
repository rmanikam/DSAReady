package SlidingWindow;

import java.io.*;
// public class Solution {

//     static int isUgly(int n)
//     {
        // Base Cases
//         if (n == 1)
//             return 1;
//         if (n <= 0)
//             return 0;

        // Condition to check if
        // a number is divide by
        // 2, 3, or 5
//         if (n % 2 == 0) {
//             return (isUgly(n / 2));
//         }
//         if (n % 3 == 0) {
//             return (isUgly(n / 3));
//         }
//         if (n % 5 == 0) {
//             return (isUgly(n / 5));
//         }
//         return 0;
//     }

//     Driver Code
//     public static void main(String args[])
//     {
//         int no = isUgly(14);
//         if (no == 1)
//             System.out.println("Yes");
//         else
//             System.out.println("No");
//     }
// }

// using 2 pointer

// Java implementation using two-pointer logic
public class Solution {

    // Function to check if a number is an ugly number
    static boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {2, 3, 5};
        int pointer = 0;

        while (n > 1 && pointer < factors.length) {
            if (n % factors[pointer] == 0) {
                n /= factors[pointer]; // divide by current factor
            } else {
                pointer++; // move to next factor
            }
        }

        return n == 1;
    }

    // Driver code
    public static void main(String[] args) {
        int num = 14;

        if (isUgly(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
