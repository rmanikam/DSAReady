package SlidingWindow;

// brute force

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int len = 0, maxLen = 0;
//         int n = nums.length;
//         for(int i = 0; i < n; i++)
//         {
//             int zeros = 0;
//             for(int j = i; j < n; j++)
//             {
//                 if(nums[j] == 0)
//                 {
//                     zeros++;
//                 }
//                 if(zeros <= k)
//                 {
//                     len = j-i+1;
//                     maxLen = Math.max(maxLen, len);
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//         }
//         return maxLen;
//     }
// }
// better sol

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int l = 0, r = 0, len = 0, maxLen = 0, zeros = 0;
//         int n = nums.length;
//         while(r < nums.length)
//         {
//             if(nums[r] == 0)
//             {
//                zeros++; 
//             }
//             while(zeros > k)
//             {
//                 if(nums[l] == 0)
//                 {
//                     zeros--;
//                 }
//                 l++;
//             }
//             if(zeros <= k)
//             {
//                 len = r-l+1;
//                 maxLen = Math.max(maxLen, len);
//             }
//             r++;
               
//         }
//         return maxLen;
//     }
// }

// optimal

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, len = 0, maxLen = 0, zeros = 0;
        int n = nums.length;
        while(r < nums.length)
        {
            if(nums[r] == 0)
            {
               zeros++; 
            }
            if(zeros > k)
            {
                if(nums[l] == 0)
                {
                    zeros--;
                }
                l++;
            }
            if(zeros <= k)
            {
                len = r-l+1;
                maxLen = Math.max(maxLen, len);
            }
            r++;
               
        }
        return maxLen;
    }
}