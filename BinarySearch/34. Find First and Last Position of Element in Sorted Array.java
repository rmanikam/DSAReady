package BinarySearch;

class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int [] output = new int [2];
        output[0] = findFirst(nums, target);
        output[1] = findLast(nums, target);
        return output;
    }

    private int findFirst(int [] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end  = n - 1;
        int ans = -1;
      
         while(start <= end)
         {
            int mid = start + (end - start)/ 2;
            if(nums[mid] == target)
            {
                ans = mid;
                end  = mid - 1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
         }
         return ans;
    }
     private int findLast(int [] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end  = n - 1;
        int ans = -1;
      
         while(start <= end)
         {
            int mid = start + (end - start)/ 2;
            if(nums[mid] == target)
            {
                ans = mid;
                start  = mid + 1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
         }
         return ans;
    }
}