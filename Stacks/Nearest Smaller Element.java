package Stacks;


import java.util.Stack;

 class Solution {
    public int[] nextSmaller(int[] A) {
        
        
        int n = A.length;
        int[] nse = new int[n];
        Stack <Integer> st = new Stack<Integer>();
        for(int i = 0; i < n; i++ )
        {
            while(!st.isEmpty() && st.peek() >= A[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nse[i] = st.peek();
            }
            else
            {
                nse[i] = -1;
            }
            st.push(A[i]);
        }
        return nse;
        
        
        
        
    }
}
