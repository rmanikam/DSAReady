package Strings;

import java.util.Stack;

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here
        
        Stack<Character> st = new Stack<Character>();
     
        
        int i = 0;
        while(i < x.length())
        {
            char ch = x.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if(st.empty())
                {
                  return false;   
                }
                  char top = st.pop();
                  if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
            i++;
        }
      return st.isEmpty();
    }
}
