package Stacks;

import java.util.Stack;

//brute force
// class Solution {
//     public ArrayList<Integer> nextLargerElement(int[] arr) {
//         code here
//         int n = arr.length;
//         ArrayList<Integer> nge = new ArrayList<>();

//         for(int i =0; i < n; i++)
//         {
//             nge.add(-1);
//         }
//         for(int i = 0; i<n ; i++)
//         {
//             for(int j = i+1; j <n; j++)
//             {
//                 if(arr[j] > arr[i])
//                 {
//                     nge.set(i, arr[j]);
//                     break;
//                 }
//             }

//         }
//         return nge;

//     }
// }

// optimal solution

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> nge = new ArrayList<>();

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            nge.add(-1);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nge.set(i, st.peek());
            }
            st.push(arr[i]);

        }
        return nge;

    }
}