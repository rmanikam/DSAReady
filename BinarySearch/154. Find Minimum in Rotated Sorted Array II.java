package BinarySearch;


class Solution {
    public int findMin(int[] nums) {
   if(nums == null || nums.length == 0)
   {
      return Integer.MIN_VALUE;
   }
    int ans = Integer.MAX_VALUE;
    int start = 0;
    int end = nums.length - 1;
       while(start <= end)
       {
        int mid = start + (end-start)/ 2;
        if(nums[start] <= nums[mid])
        {
            if(nums[mid] <= nums[end])
            {
               ans = Math.min(ans, nums[start]);
               start++;
            }
            else
            {
                ans = Math.min(ans, nums[mid]);
                start = mid + 1;
            }
            
        }
        else
        {
            if(nums[mid] >= nums[end])
            {
                ans = Math.min(ans, nums[end]);
                end--;
            }
            else
            {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }
      
       }
       return ans; 
       
       
    }
}
