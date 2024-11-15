package SlidingWindow;


class Solution {
    static String minWindow(String s1, String s2) {
        // code here
         int n = s1.length();
        int m = s2.length();

        if (m > n) return "";

        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;


        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int s1Ptr = i, s2Ptr = 0;

           
                while (s1Ptr < n && s2Ptr < m) {
                    if (s1.charAt(s1Ptr) == s2.charAt(s2Ptr)) {
                        s2Ptr++;
                    }
                    s1Ptr++;
                }

                if (s2Ptr == m) {
                    
                    int end = s1Ptr; 
                    s2Ptr--;         
                    s1Ptr--;         

                    while (s2Ptr >= 0) {
                        if (s1.charAt(s1Ptr) == s2.charAt(s2Ptr)) {
                            s2Ptr--;
                        }
                        s1Ptr--;
                    }

                    int start = s1Ptr + 1;

                    if (end - start < minLength) {
                        minLength = end - start;
                        startIdx = start;
                    }
                }
            }
        }

        return startIdx == -1 ? "" : s1.substring(startIdx, startIdx + minLength);
    }
}
