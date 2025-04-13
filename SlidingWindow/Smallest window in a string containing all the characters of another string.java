package SlidingWindow;
import java.util.HashMap;
class Solution {
    // Function to find the smallest window in the string s1 consisting
    // of all the characters of string s2.
    public static String smallestWindow(String s1, String s2) {
        if (s2.length() > s1.length()) return "-1";

        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, r = 0;
        int n = s1.length();
        int m = s2.length();
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;

        // Store the frequency of each character in s2
        for (int i = 0; i < m; i++) {
            mp.put(s2.charAt(i), mp.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // Sliding window approach
        while (r < n) {
            char charRight = s1.charAt(r);

            // If the current character is part of s2, decrease its count in the map
            if (mp.containsKey(charRight)) {
                mp.put(charRight, mp.get(charRight) - 1);
                if (mp.get(charRight) >= 0) {
                    count++;
                }
            }

            // When all characters are matched
            while (count == m) {
                // Update minimum length and starting index if a smaller window is found
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    startIdx = l;
                }

                char charLeft = s1.charAt(l);

                // Move the left pointer of the window
                if (mp.containsKey(charLeft)) {
                    if (mp.get(charLeft) == 0) {
                        count--;
                    }
                    mp.put(charLeft, mp.get(charLeft) + 1);
                }
                l++;
            }
            r++;
        }

        // Return the smallest window or "-1" if no valid window is found
        return startIdx == -1 ? "-1" : s1.substring(startIdx, startIdx + minLength);
    }
}
