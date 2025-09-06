package BinarySearch;

class Solution {

    // static int maxSubarraySize(int[] arr, int k) {
    // int n = arr.length;

    // to store the answer

    // int ans = -1;

    // generate all possible subarrays
    // for (int i = 1; i <= n; i++) {

    // to store the max sum of all
    // possible subarrays of size i
    // int maxSum = Integer.MIN_VALUE;

    // for (int j = 0; j < n - i + 1; j++) {

    // calculate the sum of the subarray
    // int sum = 0;
    // for (int l = j; l < j + i; l++) {
    // sum += arr[l];
    // }

    // update the max sum
    // maxSum = Math.max(maxSum, sum);
    // }

    // if the maxSum is less than or equals to k
    // if (maxSum <= k) {
    // ans = Math.max(ans, i);
    // }
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4};
    // int k = 8;
    // System.out.println(maxSubarraySize(arr, k));
    // }

    // better approach

    // static int maxSubarraySize(int[] arr, int k) {
    // int n = arr.length;

    // initialize the low and high pointers
    // int low = 1, high = n;

    // perform binary search
    // while(low <= high) {
    // int mid = low + (high - low) / 2;

    // to store the sum of the subarray
    // int sum = 0;

    // to store the max sum of all
    // possible subarrays of size mid
    // int maxSum = Integer.MIN_VALUE;

    // for(int i = 0; i < n; i++) {
    // sum += arr[i];

    // if(i >= mid) {
    // sum -= arr[i - mid];
    // }

    // if(i >= mid - 1) {
    // maxSum = Math.max(maxSum, sum);
    // }
    // }

    // if(maxSum <= k)
    // low = mid + 1;
    // else
    // high = mid - 1;
    // }

    // if(high == 0)
    // return -1;
    // return high;
    // }

    // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4};
    // int k = 8;
    // System.out.println(maxSubarraySize(arr, k));
    // }

    // optimal approach

    static int maxSubarraySize(int[] arr, int k) {
        int n = arr.length;

        // to store the start and end
        // point of the subarray
        int start = 0, end = 0;

        // to store the sum of subarray
        int sum = 0;

        // to store the minimum size of
        // subarray with sum greater than k
        int minLen = n + 1;

        // using sliding window technique
        // to find the subarray
        while (end < n) {

            // add the current element to the sum
            // and increase the end pointer
            sum += arr[end];
            end++;

            // if the sum is greater than k
            while (sum > k) {
                minLen = Math.min(minLen, end - start);
                sum -= arr[start];
                start++;
            }
        }

        int ans = minLen - 1;

        if (ans == 0)
            return -1;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 8;
        System.out.println(maxSubarraySize(arr, k));
    }
}
