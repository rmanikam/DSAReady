package BinarySearch;

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end  = n- 1;
        int ans = Integer.MAX_VALUE;
        while(start <= end)
        {
            int mid = start + (end - start)/ 2;
            if(nums[start] <= nums[mid])
            {
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            }
            else
            {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }

        }
        return ans;
    }
}

// Notes

// In Binary Search it eliminates left half/ right half
// Identify the sorted half
// Q) Why is right half not sorted?
// A) Right Half is not sorted because of rotation

// Because Rotating point is on right half therefore it is not sorted
// If rotating point is on right half thereby it is not sorted
// if rotating point is on right half then rotating point may have min element 
// hence right part might have your ans

// Note: The sorted half may or may not have the min element


// In this question take min from sorted half and eliminate that half

// Note: If left half is not sorted then right half is sorted and vice versa

// that is how property of rotated sorted array works

// Note for single element give = sign for comparisiion purposes

// like here there is = sign for single element => if(nums[start] <= nums[mid]) or

// nums[mid] <= nums[end]


// Note smallest is at mid for right half

// if(nums[start] <= nums[mid])
//             {
//                 ans = Math.min(ans, nums[start]);
//                 start = mid + 1;
//             }
//             else
//             {
//                 ans = Math.min(ans, nums[mid]); // here we take nums[mid] because smallest is at mid
                // for right half example is 4 5 1 2 3. here low = 4, mid = 1, end = 3.
                // here smallest is at mid
            //     end = mid - 1;
            // }
