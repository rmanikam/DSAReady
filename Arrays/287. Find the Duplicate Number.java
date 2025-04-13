package Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
           // brute force
            // Arrays.sort(nums);

            // for(int i = 0; i < nums.length; i++)
            // {
            //     if(nums[i] == nums[i +1])
            //     {
            //         return nums[i];
            //     }
            // }
            // return -1;
            // Optimal Approach
            int slow = nums[0];
            int fast = nums[0];
            do{
                slow = nums[slow];
                fast = nums[nums[fast]];
            }while(slow !=fast);

            slow = nums[0];
            while(slow != fast)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
    }
}