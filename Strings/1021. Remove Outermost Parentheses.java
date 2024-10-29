package Strings;

// class Solution {
//     public String removeOuterParentheses(String s) {
//         int count = 0;
//         StringBuilder ans = new StringBuilder("") ;
//         for(int i = 0; i < s.length(); i++)
//         {
            
           
//             if(s.charAt(i) == ')')
//             {
//                 count--;
//             }
//              if(count != 0)
//             {
//                 ans.append(s.charAt(i));
//             }
            
//             if(s.charAt(i) == '(')
//             {
//                 count++;
//             }

//         }
//         return ans.toString();
//     }
// }
// class Solution {

//     public String removeOuterParentheses(String s) {
     
//      StringBuilder str = new StringBuilder();
//       int count = 0;
//       for(char ch: s.toCharArray())
//       {
//          if(ch == '(' && count++ > 0) str.append(ch);
//          if(ch== ')' && count-- > 1 ) str.append(ch);
//       }
//       return str.toString();
//     }
//   }

import java.util.Stack;

class Solution {

    public String removeOuterParentheses(String s) {
     
     StringBuilder str = new StringBuilder();
      Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                if(st.size() > 0)
                {
                    str.append(s.charAt(i)); 
                }
                st.push(s.charAt(i));

            }
            else 
            {
                st.pop();
                if(st.size() > 0)
                {
                    str.append(s.charAt(i));
                }
                
            }
        }
    
      return str.toString();
    }
  }

