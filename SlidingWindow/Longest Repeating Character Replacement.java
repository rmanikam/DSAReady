package SlidingWindow;

// using hashMap
// class Solution {
//     public int characterReplacement(String s, int k) {
//         int maxlen = 0, l = 0, r =0, maxf =0;
//         HashMap<Character, Integer> hm = new HashMap<>();
//         int n = s.length();
//         while(r < n)
//         {
//             char rightChar = s.charAt(r);
//           hm.put(rightChar, hm.getOrDefault(rightChar, 0)+1);
//           maxf = Math.max(maxf, hm.get(rightChar));

//           if((r - l + 1) - maxf > k)
//           {
//             char leftChar = s.charAt(l);
//              hm.put(leftChar, hm.get(leftChar) -1);
//              l = l +1;

//           }
//           if((r- l + 1 -maxf) <= k)
//           {
//             maxlen = Math.max(maxlen, r - l  +1);
          
//           }
//           r = r+1;
//         }
//         return maxlen;
//     }
// }

// optimal sol1
// class Solution {
//     public int characterReplacement(String s, int k) {
//         int maxLen = 0;
//         int n = s.length();
//          int i = 0;   
//         int[] hash = new int[26];
//         int maxf = 0;
//         for(int j = 0; j < n;j++)
//         {
//             hash[s.charAt(j) - 'A']++;
//             maxf = Math.max(maxf, hash[s.charAt(j) - 'A']);
//             int changes = (j-i+1) - maxf;

//             if(changes > k)
//             {
//                 hash[s.charAt(i) - 'A']--;
//                 i++;
//             }
//             maxLen = Math.max(maxLen, j-i+1);
//         }
//         return maxLen;

//     }
// }



// optimal sol2
class Solution {
    public int characterReplacement(String s, int k) {
      
        int n = s.length();
        int l = 0, r =0, maxLen = 0, maxF = 0;
        int[] hash = new int[26];
        while(r <s.length())
        {
          hash[s.charAt(r) - 'A']++;
     
          maxF = Math.max(maxF, hash[s.charAt(r) - 'A']);
    
          while((r-l+1)- maxF > k )
          {
             hash[s.charAt(l) - 'A']--;
             for(int i = 0; i < 26;i++)
             {
                maxF = Math.max(maxF, hash[i]);
             }
             l++;
          }


          if((r-l+1) - maxF <= k)
          {
            maxLen = Math.max(maxLen, r-l + 1);
          }
          r++;


        }
        return maxLen;
       

    }
}

