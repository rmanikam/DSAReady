package Recursion;

class Solution {
    public void reverseStringHelper(char[] s, int start, int end)
    {
        if(start>= end)
        {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
       reverseStringHelper(s, start+1, end-1);
    }
    public void reverseString(char[] s) {
        
        reverseStringHelper(s, 0, s.length - 1);

    }
}