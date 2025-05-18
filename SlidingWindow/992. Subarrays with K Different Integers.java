package SlidingWindow;
// import java.util.HashMap;
// class Solution {
//     public int subarraysWithKDistinctValues(int[]nums, int k)
//     {

//         int l = 0;
//         int r = 0;
//         HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
//         int count = 0;

//         int n = nums.length;
//         while(r < n)
//         {
            
//              mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
             
//              while(mp.size() > k)
//              {
//                 mp.put(nums[l], mp.get(nums[l])- 1);
//                 if(mp.get(nums[l]) == 0)
//                 {
//                     mp.remove(nums[l]);
                    
//                 }
//                 l = l + 1;
//              }
//              count += r - l  + 1;
//              r = r + 1;
            
//         }
//         return count;


//     }

//     public int subarraysWithKDistinct(int[] nums, int k) {
        
//         return subarraysWithKDistinctValues(nums, k) - subarraysWithKDistinctValues(nums, k-1);
//     }
// }

// brute force

// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//              HashMap<Integer, Integer> mpp = new HashMap<>();
//             for(int j = i; j < n; j++)
//             {
//                mpp.put(nums[j], mpp.getOrDefault(nums[j], 0) + 1);
//                if(mpp.size()== k)
//                {
//                 count++;
//                }
//                else if(mpp.size() > k)
//                {
//                 break;
//                }

               
//             }
//         }
//         return count;
//     }
// }

// optimal

class Solution {
    public int helper(int[] nums, int k)
    {
       int n = nums.length;
       Map<Integer, Integer> freqMap = new HashMap<>();
       int l = 0, r = 0, count = 0;
      while(r < nums.length)
      {
       freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

        while(freqMap.size() > k)
        {
    freqMap.put(nums[l], freqMap.get(nums[l]) - 1);
           if(freqMap.get(nums[l]) == 0)
           {
            freqMap.remove(nums[l]);
           }
           l = l + 1;
        }
        count += r-l+1;
        r= r+1;
      }
      return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) { 
        return helper(nums, k) - helper(nums, k -1 ); 
    }
}