package Strings;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMapping = new HashMap<Character, Character>();
        

        for(int i = 0; i < s.length(); i++)
        {
            if(!charMapping.containsKey(s.charAt(i)))
            {
                if(!charMapping.containsValue(t.charAt(i)))
                {
                    charMapping.put(s.charAt(i), t.charAt(i));
                }
                else
                {
                    return false;
                }
            }
            else
            {
                int getKey = charMapping.get(s.charAt(i));
                if(getKey != t.charAt(i))
                {
                    return false;
                }
            }
        }
        return true;
        

    }
}