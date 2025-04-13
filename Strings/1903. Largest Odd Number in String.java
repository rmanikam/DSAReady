package Strings;
class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder("");
        for(int i =  num.length()-1; i >= 0; i--)
        {
          if((num.charAt(i) - '0') % 2 != 0)
            {
                ans.append(num.substring(0, i  +1));
                return ans.toString();
            }
            
        }
        return ans.toString();
    }
}