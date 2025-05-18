package SlidingWindow;

// brute force
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> result = new ArrayList<>();
//         int sLen = s.length();
//         int pLen = p.length();

//         if (sLen < pLen) return result;

//         for (int i = 0; i <= sLen - pLen; i++) {
//             Count frequency of substring s[i ... i+pLen-1]
//             int[] subFreq = new int[26];
//             for (int j = i; j < i + pLen; j++) {
//                 subFreq[s.charAt(j) - 'a']++;
//             }

//             Count frequency of string p
//             int[] pFreq = new int[26];
//             for (int k = 0; k < pLen; k++) {
//                 pFreq[p.charAt(k) - 'a']++;
//             }

//             Compare both frequency arrays
//             boolean isAnagram = true;
//             for (int l = 0; l < 26; l++) {
//                 if (subFreq[l] != pFreq[l]) {
//                     isAnagram = false;
//                     break;
//                 }
//             }

//             if (isAnagram) result.add(i);
//         }
//         return result;
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    int sLen = s.length(), pLen = p.length();

    if (sLen < pLen) return result;

    int[] pFreq = new int[26];
    int[] sFreq = new int[26];

    // Count frequency of characters in p
    for (int i = 0; i < pLen; i++) {
        pFreq[p.charAt(i) - 'a']++;
        sFreq[s.charAt(i) - 'a']++;  // first window
    }

    // Check first window
    if (Arrays.equals(pFreq, sFreq)) {
        result.add(0);
    }

    // Slide the window
    for (int i = pLen; i < sLen; i++) {
        // Remove the leftmost char of previous window
        sFreq[s.charAt(i - pLen) - 'a']--;
        // Add the new char
        sFreq[s.charAt(i) - 'a']++;

        if (Arrays.equals(pFreq, sFreq)) {
            result.add(i - pLen + 1);
        }
    }

    return result;

   }
}