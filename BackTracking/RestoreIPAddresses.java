package BackTracking;
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(s, res, "", 0, 0);
        return res;
    }
    private void helper(String s, List<String> res, String ans, int i, int par)
    {
        // base case
        if(i == s.length() || par == 4)
        {
            if(i == s.length() && par == 4)
            {
               res.add(ans.substring(0, ans.length()-1));
               
            }
            return;
        }
        if(isValid(s.substring(i, i+1)))
        {
           helper(s, res, ans+ s.charAt(i) +".", i+1, par +1);
        }
        
        if(i+2 <= s.length() && isValid(s.substring(i, i+2)))
        {
           helper(s, res, ans+ s.substring(i, i+2) +".", i+2, par +1); 
        }
        if(i+3 <= s.length() && isValid(s.substring(i, i+3)))
        {
           helper(s, res, ans+ s.substring(i, i+3) +".", i+3, par +1); 
        }

    }
    private boolean isValid(String s)
    {
        if(s.length() > 1 && s.charAt(0) == '0')
        {
            return false;
        }
        int value = Integer.parseInt(s);
        return value <= 255;
    }
}