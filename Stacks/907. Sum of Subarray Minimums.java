package Stacks;

import java.util.Stack;
// brute force

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int sum = 0;
//         int n = arr.length;
//         int mod = (int)(1e9 + 7);
//         for(int i = 0; i < n; i++)
//         {
//             int mini = arr[i];
//             for(int j = i; j < n; j++)
//             {
//                 mini = Math.min(mini, arr[j]);
//                 sum = (sum + mini)%mod;
//             }
//         }
//         return sum;
//     }
// }

// optimal sol

class Solution {
    public int[] findNSE(int[] arr)
    {
        int n = arr.length;
        int[] nse = new int[n];
        Stack <Integer> st = new Stack<Integer>();
        for(int i = n -1; i >= 0; i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }

            nse[i] = st.isEmpty()? n : st.peek();
            st.push(i);
        }
        return nse;

    }
    public int[] findPSEE(int[] arr)
    {
         int n = arr.length;
        int[] psee = new int[n];

         Stack <Integer> st = new Stack<Integer>();
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            {
                st.pop();
            }

            psee[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return psee;

    }
    public int sumSubarrayMins(int[] arr) {
       int[] nse =  findNSE(arr);
       int[] psee = findPSEE(arr);
       int n = arr.length;
       
       int total = 0;
       int mod = (int)(1e9 + 7);
       for(int i = 0; i < n; i++)
       {
        int left = i - psee[i];
        int right = nse[i] - i;

        total = (int)(total + (right * left * 1l * arr[i]) %mod)%mod;

       }
       return total;
     }
}