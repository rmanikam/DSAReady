package SlidingWindow;
import java.util.HashMap;

// brute force
// do dry run of this code

// import java.util.HashMap;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;

//         for (int i = 0; i < n; i++) {
//             HashMap<Character, Integer> hm = new HashMap<>();
//             for (int j = i; j < n; j++) {
//                 char currentChar = s.charAt(j);
//                 if (hm.containsKey(currentChar)) {
//                     break; 
//                 }
//                 hm.put(currentChar, 1);
//                 maxLength = Math.max(maxLength, j - i + 1);
//             }
//         }
//         return maxLength;
//     }
// }

//T.C is O(N^2)
//S.C is O(min(n, m))

// optimal solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(r < n)
        {
            char currentChar = s.charAt(r);
            if(hm.containsKey(currentChar))
            {
                l = Math.max(l, hm.get(currentChar) + 1);
            }
            int len = r - l + 1;
            maxLength = Math.max(maxLength, len);
            hm.put(s.charAt(r), r);
            r++;
        }
        return maxLength;
    
    }
}

//T.C is O(N)
//S.C is O(min(n, m))

