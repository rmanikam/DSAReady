package SlidingWindow;
class Solution {

    public int numberOfSubarrays(int[] nums, int k)
    {
        int n = nums.length;
        int l = 0, r = 0, sum = 0, count = 0;
        while( r < n )
        {

            sum += (nums[r] % 2);
            while(sum > k)
            {
                sum -= (nums[l] % 2);
                l = l + 1;
            }
            count += r - l + 1;
            r = r + 1;
        }
        return count;
    }
}
