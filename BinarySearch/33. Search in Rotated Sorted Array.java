package BinarySearch;
class Solution {
   
    // notes
  
    // I was doing simple binary search initially because i didnt know how to do it. 
    // Then i watch video of aditya but still i didnt get the right answer. then i watched 
    // the strivers video. i was stuck here . what i had to do is this:-       
              // now check for 2 things is array sorted on the left or it is sorted on the  
             // right. if array is sorted on left then check if target lies between start     
             // and mid. if yes then eliminate right half. if not then does it lie between 
             // mid and right. if yes then eliminate left half. similarly if array is sorted 
             // on right then check if target lies between mid and right. if yes then 
             // eliminate left half. if not then if target lies between left and mid. then 
             // eliminate right half. 
      public int search(int[] nums, int target) {
          int n = nums.length;
          int start = 0;
          int end = n-1;
  
          while(start <= end)
          {
              int mid = start + (end - start )/ 2;
              if(nums[mid] == target)
              {
                  return mid;
              }
  
        
  
  
            if(nums[start] <= nums[mid])
            {
                if(nums[start] <= target && target <= nums[mid])
                {
                    end = mid - 1;
                } 
                else
                {
                    start = mid + 1;  
                }
            }
            else
            {
               if(nums[mid] <= target && target <= nums[end])
               {
                  start = mid + 1;
                  
               }
               else
               {
                  end = mid - 1;
               }
            }
  
          }
          return -1;
         
      }
  }