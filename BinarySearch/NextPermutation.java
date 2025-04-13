package BinarySearch;

// class Solution {
    // public void nextPermutation(int[] nums) {
    //     int i = nums.length - 2;
    //     while( i >= 0 && nums[i] >= nums[i + 1])
    //     {
    //         i--;
    //     }
    //     if(i >= 0)
    //     {
    //         for(int j = nums.length - 1; j > i; j--)
    //         {
    //             if(nums[j] > nums[i])
    //             {
    //                 swap(nums, i, j);
    //                 break;
    //             }
    //         }
    //     }
    //     int start = i + 1;
    //     int end = nums.length - 1;
    //     while(start < end)
    //     {
    //         swap(nums, start, end);
    //         start++;
    //         end--;
    //     }
    // }

// The error is because the method declaration is incorrect. In Java, you don't need the keyword function when declaring a method. The correct syntax is simply private void swap
//     private void swap(int[] nums, int i, int j){
//     int temp = nums[i];
//     nums[i] = nums[j];
//     nums[j] = temp;
//    }

// 2nd approach
class Solution {
    public void swap(int[]nums, int i , int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start, int end) {
        while(start < end)
        {
            swap(nums, start, end);
            start++;
            end--;
        }
    
    }
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i = n-2; i>= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
              ind = i;
              break;
            }
        }
        if(ind != -1){
            for(int i = n-1; i> ind; i--)
            {
                if(nums[i] > nums[ind])
                {
                swap(nums, i, ind);
                break;
                }
            }
        }
        reverse(nums, ind + 1, n-1);

    }
}
   
//  }