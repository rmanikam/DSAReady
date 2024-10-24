package Stacks;

import java.util.Stack;

// brute force gives tle

// class Solution {

//     public int[] findpse(int[] heights)
//     {
//         int n = heights.length;
//         int[] pse = new int[n];
//         Stack<Integer> st = new Stack<Integer>();
//         for(int i = 0; i < n; i++)
//         {
//             while(!st.isEmpty() && heights[i] <= st.peek())
//             {
//                 st.pop();
//             }
//             if(st.isEmpty())
//             {
//                 pse[i] = -1;
//             }
//             else
//             {
//                 pse[i] = st.peek();
//             }
//             st.push(heights[i]);
//         }
//         return pse;
//     }
    
//     public int[] findnse(int[] heights)
//     {
//         int n = heights.length;
//         int [] nse = new int[n];
//         Stack<Integer> st = new Stack<Integer>();
//         for(int i = n-1; i>= 0; i--)
//         {
//             while(!st.isEmpty() && heights[i] < st.peek())
//             {
//                 st.pop();
//             }      
//             if(st.isEmpty())
//             {
//                 nse[i] = -1;
//             }
//             else
//             {
//                 nse[i] = st.peek();
//             }
//             st.push(heights[i]);
//         }
//         return nse;
//     }
//      public int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         int[] nse = findnse(heights);
//         int[] pse = findpse(heights);
//         int max = 0;

//         // Iterate over all bars to calculate the area
//         for (int i = 0; i < n; i++) {
//             int leftLimit = -1, rightLimit = n;

//             // Finding the left and right bounds based on PSE and NSE values
//             for (int j = i - 1; j >= 0; j--) {
//                 if (pse[i] == heights[j]) {
//                     leftLimit = j;
//                     break;
//                 }
//             }

//             for (int j = i + 1; j < n; j++) {
//                 if (nse[i] == heights[j]) {
//                     rightLimit = j;
//                     break;
//                 }
//             }

//             // Calculate the width of the rectangle
//             int width = rightLimit - leftLimit - 1;

//             // Calculate the area and update the maximum
//             max = Math.max(max, heights[i] * width);
//         }

//         return max;
//     }
// }

// optimal 

class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        Stack<Integer> st = new Stack<Integer>();
        int maxi = 0;
        for(int i = 0; i < n; i++)
        {
           while(!st.isEmpty() && heights[st.peek()] > heights[i])
           {
              int element = st.peek(); 
              st.pop();
              int nse = i;
              int pse = st.isEmpty()? -1 : st.peek();
               maxi = Math.max(heights[element] * (nse - pse -1), maxi);
               
           }
           st.push(i);
           

        }
        while(!st.isEmpty() )
           {
              int element = st.peek(); 
               st.pop();
              int nse = n;
              int pse = st.isEmpty()? -1 : st.peek();
               maxi = Math.max(heights[element] * (nse - pse -1), maxi);
           }
           return maxi;
    }
}