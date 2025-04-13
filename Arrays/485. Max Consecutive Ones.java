package Arrays;


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int count = 0;
        int max_count = 0;
        while(i < nums.length)
        {
            if(nums[i] == 1)
            {
              count++;
            }
            else
            {
                if(max_count < count)
                {
                    max_count = count;
                }
                count  = 0;
            }
            i++;
           
        }
         if(max_count < count)
         {
            max_count = count;
         }
        
        return max_count;
    }
}