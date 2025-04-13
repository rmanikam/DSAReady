package Arrays;

import java.util.HashMap;
//Brute Force Solution
// class Solution {
//     public int subarraySum(int[] nums, int k) {
      
//        int count  = 0;
       
//        int n = nums.length;
//        for(int i = 0; i < n; i++)
//        {
//         for(int j = i; j < n; j++)
//         {  
//             int sum = 0;
//             for(int m = i; m<=j; m++)
//             {
//                sum += nums[m];
//             }
//             if(sum == k)
//             {
//                 count++;
//             }
//         }
//        }
//        return count;
//     }
// }

// Optimal Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
    //   unordered_map<int, int> mpp;
     HashMap<Integer, Integer> mpp = new HashMap<>();
      int cnt  = 0, prefixSum = 0;
      mpp.put(0, 1);
      for(int i = 0; i < nums.length; i++)
      {
        prefixSum  = prefixSum + nums[i];
        int remove  = prefixSum  - k;
        cnt += mpp.getOrDefault(remove, 0);
        mpp.put(prefixSum,mpp.getOrDefault(prefixSum, 0) + 1) ;

      }
      return cnt;

    }
}