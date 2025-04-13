package Strings;
import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Arrays.sort(strs);
        // String str1 = strs[0];
        // String str2 = strs[strs.length - 1];
        // int index = 0;

        // while(index < str1.length())
        // {
        //     if(str1.charAt(index) == str2.charAt(index))
        //     {
        //         index++;
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // return index == 0? "": str1.substring(0, index);

        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] s1 = strs[0].toCharArray(); // to convert to array we use charArray
        char[] s2 = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < s1.length; i++)
        {
            if(s1[i] == s2[i])
            {
                sb.append(s1[i]);
            }
            else
            {
                break;
            }
        }
        return sb.toString();

    
    }
}