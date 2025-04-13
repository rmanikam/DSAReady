package Stacks;

import java.util.Stack;

//brute force

// class Solution
// {
//     //Function to find the next greater element for each element of the array.
//     public static long[] nextLargerElement(long[] arr, int n)
//     { 
//         // Your code here
        
 
//         long[] ngi = new long[n];
//         for(int i = 0; i < n; i++)
//         {
//             ngi[i] = -1;
//         }
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i+1; j < n; j++)
//             {
//                  if(arr[i] < arr[j] )
//                  {
//                     ngi[i] = arr[j];
//                     break;
//                  }
//             }
           
//         }
        
//         return ngi;
//     } 



// optimal solution


// class Solution
// {
//     //Function to find the next greater element for each element of the array.
//     public static long[] nextLargerElement(long[] arr, int n)
//     { 
//         // Your code here
        
//       long [] ngi = new long[n]; 
//       Stack<Integer> st = new Stack<Integer>();
     
//        for (int i = 0; i < n; i++) {
//             // While stack is not empty and the current element is greater than the element
//             // corresponding to the index on the top of the stack
//             while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
//                 ngi[st.pop()] = arr[i];  // Set the next greater element for the popped index
//             }

//             // Push the current index to the stack
//             st.push(i);
//         }

//         // For remaining elements in the stack, there is no next greater element
//         while (!st.isEmpty()) {
//             ngi[st.pop()] = -1;
//         }

//         return ngi;
    
//     } 
// }


class Solution
{
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] ngi = new long[n]; 
        Stack<Long> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--)
        {
            // Pop elements from the stack that are smaller or equal to the current element
            while (!st.isEmpty() && st.peek() <= arr[i])
            {
                st.pop();
            }

            // If the stack is not empty, the top element is the next greater element
            if (!st.isEmpty())
            {
                ngi[i] = st.peek();
            }
            else
            {
                ngi[i] = -1; // If no greater element is found
            }

            // Push the current element onto the stack
            st.push(arr[i]);
        }

        return ngi;
    } 
}