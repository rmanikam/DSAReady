package BinarySearch;

class Solution {
    // Remember: this approach for Searching in Rotated Sorted Array I will not
    // work here in Search in Rotated Sorted Array II as we dont return indexes as
    // we did in part1.
    // reason if your array is [3 1 2 3 3 3 3] part1 wont work here for this edge
    // case. if i solve this condn arr[low] = arr[mid] and arr[mid] = arr[high] then
    // my job will be done. can i trim down my search space by doing low++ and
    // high--; if 3 at mid is not equal to target then neighter 3 at low and 3 at
    // high will be equal to target. or if 3 at mid is equal to target then 3 at low
    // and 3 at high will be equal to target. taking advantage of this condition. so
    // i shrink my search space and i continue at next step.
    public boolean helper(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            // left sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // right sorted
            else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        return helper(nums, nums.length, target);
    }
}