package Arrays;

// import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Brute Force
// class Solution {

//     public boolean ls(int[] nums, int x)
//     {
//         int n = nums.length;
//         for(int i = 0; i < n; i++)
//         {
//             if(nums[i] == x)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;
//         int largest  = 0;
//         for(int i = 0; i < n; i++)
//         {
//             int count = 1;
//             int x = nums[i];

//             while(ls(nums, x+1))
//             {
//                 x = x + 1;
//                 count = count + 1;
//             }
//             if(largest < count)
//             {
//                 largest = count;
//             }
//         }
//         return largest;
//     }
// }

// Brute Force gives TLE as Time Complexity is O(n^2) and space complexity is O(1)

// better solution by sorting the array

// class Solution {

//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;

//         if(n==0)
//         {
//             return 0;
//         }
//         int longest = 1;
//         int lastSmaller = Integer.MIN_VALUE;

//         Arrays.sort(nums);
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(nums[i] - 1 == lastSmaller)
//             {
//                 count = count + 1;
//                 lastSmaller = nums[i];
//             }
//             else if(nums[i] != lastSmaller)
//             {
//                  count = 1;
//                  lastSmaller = nums[i];
//             }
//             longest = Math.max(longest, count);
//         }
//         return longest;
//     }
// }

// optimal solution
class Solution {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n==0)
        {
            return 0;
        }
        int longest = 1;
        int count = 0;
        int x = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++)
        {
            set.add(nums[i]);
        }
        
        for(int it: set)
        {
            if(!set.contains(it -1))
            {
                count = 1;
                x = it;

                while(set.contains(x + 1))
                {
                   count = count + 1;
                   x = x + 1;
                }
                longest = Math.max(longest, count);
            }
        }
         return longest;
    }
}