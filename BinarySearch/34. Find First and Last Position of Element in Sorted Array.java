package BinarySearch;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] output = new int[2];
        output[0] = findFirst(nums, target);
        output[1] = findLast(nums, target);
        return output;
    }

    private int findFirst(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

// better sol
// class Solution {

// public int lowerBound(int[]nums, int n, int target)
// {
// int start = 0;
// int end = n - 1;
// int first = -1;
// while(start <= end)
// {
// int mid = start + (end - start) / 2;
// if(nums[mid] == target)
// {
// first = mid;
// end = mid -1;
// }
// else if(nums[mid] < target)
// {
// start = mid + 1;
// }
// else
// {
// end = mid -1;
// }
// }
// return first;
// }
// public int upperBound(int[]nums, int n, int target)
// {
// int start = 0;
// int end = n - 1;
// int last = -1;
// while(start <= end)
// {
// int mid = start + (end-start)/ 2;
// if(nums[mid] == target)
// {
// last = mid;
// start = mid + 1;
// }
// else if(nums[mid] < target)
// {
// start = mid + 1;
// }
// else
// {
// end = mid - 1;
// }

// }
// return last;
// }

// public int[] searchRange(int[] nums, int target) {

// int [] output = new int[2];
// int first = lowerBound(nums, nums.length, target);
// if(first == -1)
// {
// output[0] = -1;
// output[1] = -1;
// return output;
// }
// int last = upperBound(nums, nums.length, target);

// output[0] = first;
// output[1] = last;
// return output;
// }
// }
// brute force

// class Solution {
// public int[] searchRange(int[] nums, int target) {
// int start = -1;
// int end = -1;
// int i = 0;
// int j = nums.length;
// int[] output= new int[2];

// while(i < j)
// {

// if(nums[i] == target)
// {
// if(start == -1)
// {
// start = i;

// }
// end = i;
// }
// i++;
// }
// output[0] = start;
// output[1] = end;
// return output;

// }
// }
