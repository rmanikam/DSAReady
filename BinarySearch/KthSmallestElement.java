package BinarySearch;

import java.util.Arrays;

class KthSmallestElement {

	// Function to return the kth smallest
	// element from the array
	static int kthSmallest(int[] arr, int k, int n) {

		// Minimum and maximum element from the array
		int low = Arrays.stream(arr).min().getAsInt();
		int high = Arrays.stream(arr).max().getAsInt();

		// Modified binary search
		while (low <= high) {

			int mid = low + (high - low) / 2;

			// To store the count of elements from the array
			// which are less than mid and
			// the elements which are equal to mid
			int countless = 0, countequal = 0;
			for (int i = 0; i < n; ++i) {
				if (arr[i] < mid)
					++countless;
				else if (arr[i] == mid)
					++countequal;
			}

			// If mid is the kth smallest
			if (countless < k
					&& (countless + countequal) >= k) {
				return mid;
			}

			// If the required element is less than mid
			else if (countless >= k) {
				high = mid - 1;
			}

			// If the required element is greater than mid
			else if (countless < k
					&& countless + countequal < k) {
				low = mid + 1;
			}
		}
		return Integer.MIN_VALUE;
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int n = arr.length;
		int k = 3;

		System.out.println(kthSmallest(arr, k, n));
	}
}
