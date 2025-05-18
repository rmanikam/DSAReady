package BackTracking;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper("",0,0,n,ans);
        return ans;
    }
    private void helper(String curr, int open, int close, int total, List<String> ans)
    {
        if(curr.length() == 2 * total)
        {
          ans.add(curr);
          return;
        }

        if(open < total)
        {
           helper(curr + '(', open + 1, close, total, ans);
        }
        if(close < open)
        {
            helper(curr + ')', open, close + 1, total, ans);
        }
        

    }
}