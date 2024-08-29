package Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while( i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        if(i >= 0)
        {
            for(int j = nums.length - 1; j > i; j--)
            {
                if(nums[j] > nums[i])
                {
                    swap(nums, i, j);
                    break;
                }
            }
        }
        int start = i + 1;
        int end = nums.length - 1;
        while(start < end)
        {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

// The error is because the method declaration is incorrect. In Java, you don't need the keyword function when declaring a method. The correct syntax is simply private void swap
    private void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
   }
   
}
