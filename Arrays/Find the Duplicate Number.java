package Arrays;

// brute force
// class Solution {
//     public int findDuplicate(int[] nums) {
        
//         int sum = 0;
//         int calculateProduct = 0;
//         int n = nums.length;
//         int count = 1;
//         for(int i = 0; i < n-1; i++)
//         {
//             if(nums[i] == nums[i+1])
//             {
//               count++;
//             }
//             if(count == n)
//             {
//                 break;
//             }
//         }
//          if(count == n)
//          {
//                 return nums[0];
//          }
        
//         int ans = 0;
//         for(int i = 0; i < n-1; i++)
//         {    
//             count  = 1;
//             for(int j = i + 1; j <n; j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     count++;
                    
//                 }
//             }
//             if(count > 1)
//             {
//              ans = nums[i];
//              break;
//             }
        
//         }
    
//         return ans;
//     }
// }

// brute force1

// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         int ans = -1;
//         int j;
//         for(int i = 0; i < n-1; i++)
//         {
            
//             for(j = i+1; j < n; j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     break;
//                 }
//             }
//             if(j != n && nums[i] == nums[j])
//             {
//                 ans = nums[i];
//                 break;
//             }
//         }
//         return ans;
//     }
// }
// better approach

// class Solution {
//     public int findDuplicate(int[] nums) {
        
//             Arrays.sort(nums);

//             for(int i = 0; i < nums.length; i++)
//             {
//                 if(nums[i] == nums[i +1])
//                 {
//                     return nums[i];
//                 }
//             }
//             return -1;
//     }
// }

// optimal approach

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
            {
                break;
            }

        
        }
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;


    }
}
