package Stacks;

import java.util.Stack;
// class Solution {

// brute force

//     public int[] nextGreaterElements(int[] nums) {

//         int n = nums.length;
//         int[] nge = new int[n];
//         for (int i = 0; i < n; i++) {
//             nge[i] = -1;
//         }

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j < i + n ; j++)
//             {
//                 int index = j % n;
//                 if(nums[index] > nums[i])
//                 {
//                     nge[i] = nums[index];
//                     break;
//                 }
//             }
//         }
//         return nge;
//     }
// }

// do this again when revising

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                nge[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i % n]);

        }
        return nge;

    }
}