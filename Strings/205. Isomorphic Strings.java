package Strings;

import java.util.HashMap;

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> charMapping = new HashMap<Character, Character>();
        

//         for(int i = 0; i < s.length(); i++)
//         {
//             if(!charMapping.containsKey(s.charAt(i)))
//             {
//                 if(!charMapping.containsValue(t.charAt(i)))
//                 {
//                     charMapping.put(s.charAt(i), t.charAt(i));
//                 }
//                 else
//                 {
//                     return false;
//                 }
//             }
//             else
//             {
//                 int getKey = charMapping.get(s.charAt(i));
//                 if(getKey != t.charAt(i))
//                 {
//                     return false;
//                 }
//             }
//         }
//         return true;
        

//     }
// }

// optimal approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Boolean> used = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
             char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(smap.containsKey(sc))
            {
                if(smap.get(sc) != tc)
                {
                    return false;
                }
            }
            else
            {
                if(used.containsKey(tc))
                {
                    return false;
                }
                smap.put(sc,tc);
                used.put(tc, true);
            }
        }
        return true;
    }
}