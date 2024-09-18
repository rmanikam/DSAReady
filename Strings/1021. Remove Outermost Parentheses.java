package Strings;

class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder("") ;
        for(int i = 0; i < s.length(); i++)
        {
            
           
            if(s.charAt(i) == ')')
            {
                count--;
            }
             if(count != 0)
            {
                ans.append(s.charAt(i));
            }
            
            if(s.charAt(i) == '(')
            {
                count++;
            }

        }
        return ans.toString();
    }
}