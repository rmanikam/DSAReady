package SlidingWindow;

//brute force
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

// better
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int slow = nums[0];
//         int fast = nums[0];
//         while(true)
//         {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//             if(slow == fast)
//             {
//                 break;
//             }

        
//         }
//         slow = nums[0];
//         while(slow != fast)
//         {
//             slow = nums[slow];
//             fast = nums[fast];
//         }
//         return fast;


//     }
// }

//optimal

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do
        {
           slow = nums[slow];
           fast = nums[nums[fast]];
        }while(slow != fast);
        slow = 0;
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}