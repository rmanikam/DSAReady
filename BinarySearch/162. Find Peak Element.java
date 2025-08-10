package BinarySearch;

// class Solution {
//     public int findPeakElement(int[] nums) {
//         int n = nums.length;
//         int start = 0;
//         int end = n - 1;
//          if( n== 1)
//          {
//             return 0;
//          }
//         while(start <= end)
//         {
//             int mid = start + (end - start)/ 2;
//             if(mid > 0 && mid < n - 1)
//             {
//                 if(nums[mid -1] < nums[mid] && nums[mid] > nums[mid + 1])
//                 {
//                     return mid;
//                 }
//                 else if(nums[mid - 1] > nums[mid])
//                 {
//                     end = mid - 1;
//                 }
//                 else
//                 {
//                     start = mid  +1;
//                 }
//             }
//             else if(mid == 0)
//             {
//                 if(nums[0] > nums[1])
//                 {
//                     return 0;
//                 }
//                 else
//                 {
//                     return 1;
//                 }
//             }
//             else if (mid == n-1)
//             {
//                 if(nums[n-1] > nums[n - 2])
//                 {
//                     return n-1;
//                 }
//                 else
//                 {
//                     return n-2;
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((nums[mid] > nums[mid - 1]) && (nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }
}