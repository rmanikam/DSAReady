package Arrays;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
     int[] output = new int[n];
     int posIndex = 0, negIndex = 1;
     for(int i = 0; i < n; i++)
     {
        if(nums[i] < 0)
        {
           output[negIndex] = nums[i];
           negIndex = negIndex + 2;
        }
        else
        {
           output[posIndex] = nums[i];
           posIndex = posIndex + 2;
        }
     }
     return output;

    }
}