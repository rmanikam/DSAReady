package Stacks;

import java.util.Stack;

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        int n = pre_exp.length();
        int i = n - 1; 
        Stack <String> st= new Stack<String>();
        while(i >= 0)
        {
            if((pre_exp.charAt(i) >= 'A' && pre_exp.charAt(i) <= 'Z') || 
            (pre_exp.charAt(i) >= 'a' && pre_exp.charAt(i) <= 'z'))
            {
                st.push(Character.toString(pre_exp.charAt(i)));
            }
            else
            {
                String t1 =st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();
                String con = '(' + t1 + Character.toString(pre_exp.charAt(i)) + t2 + ')';
                st.push(con);
            }
            i--;
        }
        return st.peek();
    }
}
