package Sorting;

// approach1
import java.util.*;

// class Solution {
//     private int[] count; // To store the answer for each index
    
//     public List<Integer> countSmaller(int[] nums) {
//         int n = nums.length;
//         count = new int[n]; // Initialize the count array with 0
//         int[] index = new int[n]; // To track original indices
        
//         for (int i = 0; i < n; i++) {
//             index[i] = i;
//         }
        
//         mergeSort(nums, index, 0, n - 1);
        
//         List<Integer> result = new ArrayList<>();
//         for (int c : count) {
//             result.add(c);
//         }
        
//         return result;
//     }
    
//     private void mergeSort(int[] nums, int[] index, int start, int end) {
//         if (start >= end) return;

//         int mid = start + (end - start) / 2;
//         mergeSort(nums, index, start, mid);
//         mergeSort(nums, index, mid + 1, end);
//         merge(nums, index, start, mid, end);
//     }
    
//     private void merge(int[] nums, int[] index, int start, int mid, int end) {
//         int leftSize = mid - start + 1;
//         int rightSize = end - mid;
        
//         int[] left = new int[leftSize];
//         int[] right = new int[rightSize];
//         int[] leftIndex = new int[leftSize];
//         int[] rightIndex = new int[rightSize];

//         for (int i = 0; i < leftSize; i++) {
//             left[i] = nums[start + i];
//             leftIndex[i] = index[start + i];
//         }
//         for (int i = 0; i < rightSize; i++) {
//             right[i] = nums[mid + 1 + i];
//             rightIndex[i] = index[mid + 1 + i];
//         }

//         int i = 0, j = 0, k = start, rightCounter = 0;
        
//         while (i < leftSize && j < rightSize) {
//             if (left[i] <= right[j]) {
//                 count[leftIndex[i]] += rightCounter; // Count elements smaller than left[i]
//                 nums[k] = left[i];
//                 index[k] = leftIndex[i];
//                 i++;
//             } else {
//                 rightCounter++; // This right[j] is smaller, so it should be counted
//                 nums[k] = right[j];
//                 index[k] = rightIndex[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < leftSize) {
//             count[leftIndex[i]] += rightCounter; // Count remaining smaller elements
//             nums[k] = left[i];
//             index[k] = leftIndex[i];
//             i++;
//             k++;
//         }

//         while (j < rightSize) {
//             nums[k] = right[j];
//             index[k] = rightIndex[j];
//             j++;
//             k++;
//         }
//     }
// }


//approach2
class Solution {

    public void merge(int[] nums, int[] index, int[] count, int start, int mid, int end) {
    int[] temp = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    int rightCount = 0; // Count of numbers from right subarray smaller than left subarray

    while (i <= mid && j <= end) {
        if (nums[index[j]] < nums[index[i]]) {
            temp[k] = index[j];
            rightCount++;
            j++;
        } else {
            temp[k] = index[i];
            count[index[i]] += rightCount; // Add count of smaller elements
            i++;
        }
        k++;
    }

    while (i <= mid) {
        temp[k] = index[i];
        count[index[i]] += rightCount; // Remaining left elements get rightCount added
        i++;
        k++;
    }

    while (j <= end) {
        temp[k] = index[j];
        j++;
        k++;
    }

    for (int m = start; m <= end; m++) {
        index[m] = temp[m - start];
    }
}


    public void mergeSort(int[] nums, int[] index, int[] count, int start, int end) {
    if (start >= end) {
        return;
    }

    int mid = start + (end - start) / 2;
    mergeSort(nums, index, count, start, mid); // Sort left half
    mergeSort(nums, index, count, mid + 1, end); // Sort right half
    merge(nums, index, count, start, mid, end); // Merge both halves
}
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int n = nums.length;
        int[] count = new int[n]; // Stores the answer for each index
        int[] index = new int[n]; // Stores original indexes
        for (int i = 0; i < n; i++) {
            index[i] = i; // Initialize index array
        }
        mergeSort(nums, index, count, 0, n - 1);
        for (int i : count) {
            res.add(i);
        }
        return res;

    }

}