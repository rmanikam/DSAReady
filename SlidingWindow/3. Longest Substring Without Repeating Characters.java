package SlidingWindow;
import java.util.HashMap;

// brute force
// do dry run of this code
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int start = 0; 
        
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            
       
            if (hm.containsKey(currentChar)) {
                start = Math.max(hm.get(currentChar) + 1, start);
            }
            hm.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    
    }
}


