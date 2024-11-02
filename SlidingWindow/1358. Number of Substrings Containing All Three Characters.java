package SlidingWindow;
// import java.util.HashMap;

//getting TLE for brute force.

// T.c is O(n^2)
// S.C is O(1) as i am only using 3 characters here a, b ,c
// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             HashMap<Character, Integer> hm = new HashMap<>();
//             for(int j = i; j < n; j++)
//             {
//               hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
//              if (hm.getOrDefault('a', 0) > 0 && hm.getOrDefault('b', 0) > 0 && hm.getOrDefault('c', 0) > 0) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
// optimal sol
// T.c is O(n)
// S.C is O(1) as i am only using 3 characters here a, b ,c
class Solution {
    public int numberOfSubstrings(String s) {
     
     int[] lastSeen = new int[3];
     int n = s.length();
     for(int i = 0; i <3; i++)
     {
        lastSeen[i] = -1;
     }
     int count = 0;
     for(int i = 0; i <n; i++)
     {
        lastSeen[s.charAt(i) - 'a'] = i;
          int minLastSeen = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
         count = count + minLastSeen  +1;
          
     }
     return count;
        
    }
}