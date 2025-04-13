package Strings;

class Solution {
    int countSubstr(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    int countAtMostK(String s, int k) {
        int l = 0, r = 0;
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        int count = 0;

        for (r = 0; r < n; r++) {
            char ch = s.charAt(r);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(l);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                l++;
            }

            count += (r - l + 1); // All substrings ending at r with at most k distinct chars
        }

        return count;
      
        
    }
}