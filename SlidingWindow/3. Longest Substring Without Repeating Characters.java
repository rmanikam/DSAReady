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
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int l = 0;
//         int r = 0;
//         int n = s.length();
//         int maxLength = 0;
//         HashMap<Character, Integer> hm = new HashMap<>();
//         while(r < n)
//         {
//             char currentChar = s.charAt(r);
//             if(hm.containsKey(currentChar))
//             {
//                 l = Math.max(l, hm.get(currentChar) + 1);
//             }
//             int len = r - l + 1;
//             maxLength = Math.max(maxLength, len);
//             hm.put(s.charAt(r), r);
//             r++;
//         }
//         return maxLength;
    
//     }
// }

//T.C is O(N)
//S.C is O(min(n, m))

// brute force
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
        
//         int maxLen = 0;
//        for(int i = 0; i< s.length();i++) 
//        {
//           int count = 0;
//           for(int j = i; j < s.length(); j++)
//           {
//             boolean isDuplicate = false;
//             for(int k = i; k<j;k++)
//             {
//                 if(s.charAt(k) == s.charAt(j))
//                 {
//                     isDuplicate = true;
//                     break;
//                 }
                
//             }
//             if(isDuplicate)
//             {
//                 break;
//             }
//             count++;
             
//           }
//          maxLen = Math.max(maxLen, count);
          

//        }
//        return maxLen;
//     }
// }

// better approach
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
        
//         int maxLen = 0;
//        for(int i = 0; i< s.length();i++) 
//        {
//           int count = 0;
//           Set<Character> set = new HashSet<>();
//           for(int j = i; j < s.length(); j++)
//           {
//             char ch = s.charAt(j);
//             if(set.contains(ch))
//             {
//                 break;
//             }
//             else
//             {
//                 set.add(ch);
//                 maxLen = Math.max(maxLen, j - i + 1);
    
//             }
//           }
//        }
//        return maxLen;
//     }
// }
// optimal approach
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
       while(j < s.length()) 
       {
          if(!set.contains(s.charAt(j)))
          {
            set.add(s.charAt(j));
            maxLen = Math.max(maxLen, j-i+1);
            j++;
          }
          else
          {
            set.remove(s.charAt(i));
            i++;
          }
       }
       return maxLen;
    }
}