package SlidingWindow;
import java.util.HashMap;
// brute force approach

// class Solution {

//     // arr[] : the input array containing 0s and 1s
//     // N : size of the input array

//     // return the maximum length of the subarray
//     // with equal 0s and 1s
//     int maxLen(int[] arr, int n) {
//         // Your code here
//         int maxLength = 0;
      
//     for(int i = 0; i < n; i++)
//     {
//           int count0 = 0;
//         int count1 = 0;
//         int j = 0;
//         for( j = i; j <n;j++)
//         {
//             if(arr[j] == 0 )
//             {
//                 count0++;
//             }
//             else
//             {
//                 count1++;
//             }
//             if(count0 == count1)
//             {
//                 int currentLength = j - i + 1;
//                 maxLength = Math.max(currentLength, maxLength);
//             }
//         }
        
//     }
//     return maxLength;
//   }
// }

// time complexity =O(n^2)
//space complexity is O(1);

// optimal solution using Hashmap

class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array

    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n) {
        // Your code here
        
        int cumulativeSum = 0;
        int maxLength = 0;
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      
      for(int i = 0; i < n; i++)
      {
           arr[i] = arr[i] == 0 ? -1 : 1;
      }
      
      for(int i = 0; i < n; i++)
      {
          cumulativeSum += arr[i];
          
          if(cumulativeSum == 0)
          {
              maxLength = i + 1;
          }
          
          if(hm.containsKey(cumulativeSum))
          {
              maxLength = Math.max(maxLength , i - hm.get(cumulativeSum));
          }
          else
          {
              hm.put(cumulativeSum, i);
          }
          
      }
      return maxLength;
      
   
  }

}

// Time Complexity: O(n), because we traverse the array once and use a hashmap for constant-time lookups.
// Space Complexity: O(n), for storing cumulative sums in the hashmap.