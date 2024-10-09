package Stacks;
import java.util.List;
import java.util.ArrayList;

class Solution {
    void solve(List<String> output, int open, int close, String op)
    {
        if(open == 0 && close == 0)
        {
            output.add(op);
            return;
            
        }
        if(open != 0)
        {
            solve(output, open - 1, close, op + "(");
        }
        if(close > open)
        {
            solve(output, open, close - 1, op + ")");
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>() ;
        int open = n;
        int close = n;
        String op = "";
        solve(output, open, close, op );
        return output;

    }
}