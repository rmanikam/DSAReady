package Strings;
import java.util.Stack;

class Solution {
    
    public String reverse(String S){
        //code here
        
        
        Stack<Character> rev = new Stack<Character>();
        
        for(int i = 0; i < S.length(); i++)
        {
            rev.push(S.charAt(i));
        }
        
        String reverseStr = "";
        while(!rev.empty())
        {
            reverseStr += rev.pop();
        }
        return reverseStr;
    }

}