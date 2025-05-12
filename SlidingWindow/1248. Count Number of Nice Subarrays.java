package SlidingWindow;

// brute Force

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         for(int i = 0; i < n;i++)
//         {
//             int oddCount  = 0;
          
//             for(int j = i; j < n; j++)
//             {
                
//                 if(nums[j] % 2 != 0)
//                 {
//                     oddCount++;
//                 }
//                 if(oddCount == k)
//                 {
//                     count++;
//                 }
//                 else if(oddCount > k)
//                 {
//                     break;
//                 }
                
//             }
//         }
//         return count;
//     }
// }

//optimal

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
    public int helper(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int oddCount  = 0;
        int left = 0;
        for(int right = 0; right < n; right++)
        {
            if(nums[right]%2 != 0)
            {
                oddCount++;
            }
            while(oddCount > k)
            {
               
               if(nums[left] %2 != 0)
               {
                 oddCount--;
               }
               left++;
            }
            count+= right-left + 1;
        
        }
          
            
        return count;
    }
}