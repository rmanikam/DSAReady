package Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int count  = 1;
        int output = 0;
        int n = nums.length;
        if(n == 1)
        {
            return nums[0];
        }
        for(int i = 0; i < n - 1; i++)
        {
            count  = 1;
            for(int j = i+1; j < n; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count  > n / 2)
            {
               output = nums[i];
               break;
            }
        }
        return output;
    }
}
