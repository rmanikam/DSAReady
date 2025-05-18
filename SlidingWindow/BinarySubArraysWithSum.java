package SlidingWindow;

class Solution {
    private int helper(int[]nums, int goal )
    {
         if(goal < 0)
         {
           return 0;
         }
        int l = 0;
        int r = 0;
        int ans = 0;
        int n = nums.length;
        int sum = 0;
        while(r < n)
        {
         
         sum = sum + nums[r];
          while(sum > goal)
          {
            sum = sum -nums[l];
            l++;
          }
          ans += r-l+1;
          r++;
        }
        return ans;
       
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return helper(nums, goal) - helper(nums, goal-1);
    }
}
