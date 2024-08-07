package Arrays;

class Solution {
    public void moveZeroes(int[] nums) {


       int count = 0;
       int i = 0;
        while(i < nums.length)
        {
           if(nums[i] != 0)
           {
             nums[count++] = nums[i];
           }
          i++;
        }
        while(count < nums.length)
        {
            nums[count++] = 0;
        }
        
    }
}