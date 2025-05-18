package SlidingWindow;


// class Solution {
//     static String minWindow(String s1, String s2) {
//         // code here
//          int n = s1.length();
//         int m = s2.length();

//         if (m > n) return "";

//         int minLength = Integer.MAX_VALUE;
//         int startIdx = -1;


//         for (int i = 0; i < n; i++) {
//             if (s1.charAt(i) == s2.charAt(0)) {
//                 int s1Ptr = i, s2Ptr = 0;

           
//                 while (s1Ptr < n && s2Ptr < m) {
//                     if (s1.charAt(s1Ptr) == s2.charAt(s2Ptr)) {
//                         s2Ptr++;
//                     }
//                     s1Ptr++;
//                 }

//                 if (s2Ptr == m) {
                    
//                     int end = s1Ptr; 
//                     s2Ptr--;         
//                     s1Ptr--;         

//                     while (s2Ptr >= 0) {
//                         if (s1.charAt(s1Ptr) == s2.charAt(s2Ptr)) {
//                             s2Ptr--;
//                         }
//                         s1Ptr--;
//                     }

//                     int start = s1Ptr + 1;

//                     if (end - start < minLength) {
//                         minLength = end - start;
//                         startIdx = start;
//                     }
//                 }
//             }
//         }

//         return startIdx == -1 ? "" : s1.substring(startIdx, startIdx + minLength);
//     }
// }

// brute force

// class Solution {
//     public String minWindow(String s, String t) {
//         int minLen = Integer.MAX_VALUE;
//         int sIndex = -1;
//         int n = s.length();
//         int m = t.length();
       
//         for(int i = 0; i < n; i++)
//         {
//             Map<Character, Integer> mp = new HashMap<>();
//              int count = 0;
//             for(int j = 0; j < m; j++)
//             {
                
//             mp.put(t.charAt(j), mp.getOrDefault(t.charAt(j), 0) + 1);
//             }
//             for(int k = i; k < n; k++)
//             {
//                 char ch = s.charAt(k);
//                 if(mp.containsKey(ch) && mp.get(ch) > 0)
//                 {
//                     count = count + 1;
//                 }
//                 if(mp.containsKey(ch))
//                 {
//                 mp.put(ch, mp.get(ch) - 1);        
//                 }
//                 if(count == m)
//                 {
//                     if(k - i  + 1 < minLen )
//                     {
//                         minLen = k-i+1;
//                         sIndex = i;
//                         break;
//                     }
//                 }
//             }
//         }
//         return sIndex == -1? "" : s.substring(sIndex, sIndex  + minLen);
//     }
// }


// optimal

class Solution {
    public String minWindow(String s, String t) {
        int l = 0, r = 0;
        int n = s.length(), m = t.length();
        int cnt = 0, minLen = Integer.MAX_VALUE;
        int startInd = -1;
        Map<Character, Integer> mp = new HashMap<>();
    
        for (int i = 0; i < m; i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }
    
        while (r < n) {
            char rightChar = s.charAt(r);
            if (mp.containsKey(rightChar) && mp.get(rightChar) > 0) cnt++;
            mp.put(rightChar, mp.getOrDefault(rightChar, 0) - 1);
    
            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startInd = l;
                }
                char leftChar = s.charAt(l);
                mp.put(leftChar, mp.getOrDefault(leftChar, 0) + 1);
                if (mp.get(leftChar) > 0) cnt--;
                l++;
            }
            r++;
        }
    
        return startInd == -1 ? "" : s.substring(startInd, startInd + minLen);
      }
    }