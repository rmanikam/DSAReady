package Stacks;


import java.util.List;
import java.util.ArrayList;



class Solution {
    
    public void solve(String curr, int open, int close, int total, List<String> ans)
    {
        if(curr.length() == 2 * total)
        {
            ans.add(curr);
            return;
        }
        if(open < total)
        {
            solve(curr + '(', open + 1, close, total, ans);
        }
        if(close < open)
        {
            solve(curr + ')', open, close + 1, total, ans);
        }
    }
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        String curr = "";
        List<String> ans = new ArrayList<>();
        solve(curr, 0, 0, n, ans );
        return ans;
    }
}