class Solution {
    public int searchInsertPosition(int[] nums, int target, int start, int end) {

          while(start <= end)
          {
           int mid = start + (end-start)/2;
           if(nums[mid] == target)
           {
               return mid;
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
          return start;
    }
   public int searchInsert(int[] nums, int target) {
       
       return searchInsertPosition(nums, target, 0, nums.length - 1);

   }
}