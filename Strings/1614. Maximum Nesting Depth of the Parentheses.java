package Strings;


class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;

        for(char ch:s.toCharArray())
        {
            if(ch == '(')
            {
                current++;
                
            }
            else if(ch == ')')
            {
                current--;
            }
            if(max < current)
            {
                max = current;
            }
        }
        return max;
       
    }
}