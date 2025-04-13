package BinarySearch;

import java.util.Arrays;
class Solution {
    public int count(int[] nums, int mid)
    {
        int n = nums.length;
        int countPairs =0;
        for(int i = 0; i < n; i++)
        {
            int j = i + 1;
           while(j < n && nums[j]- nums[i] <= mid )
           {
            j++;
           }
           countPairs += j - i - 1;

        }
        return countPairs;
    }
    public int smallestDistancePair(int[] nums, int k) {
         Arrays.sort(nums);
         int n = nums.length;
         int low = 0;
         int high = nums[n - 1] - nums[0];
         int ans = 0;
         while(low <= high)
         {
            int mid = low + (high - low) / 2;
            if(count(nums, mid) >= k)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                
                low = mid + 1;
            }
         }
         return ans;

    }
}