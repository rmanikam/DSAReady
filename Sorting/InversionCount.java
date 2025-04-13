package Sorting;



// User function Template for Java


class Solution {

    // Function to count inversions in the array.
    // brute force
    // static int InversionCount(int arr[]) {
    //     // Your Code Here
        
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i = 0; i < n; i++)
    //     {
    //         for(int j = i+1; j< n; j++)
    //         {
    //             if(arr[i] > arr[j])
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // optimal approach



// User function Template for Java

class Solution {
  
    private static int merge(int[] arr, int low, int mid, int high) {
     ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr
        int count=0;
        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                 count+= mid-left+1;
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        count += mergeSort(arr, low, mid);  // left half
        count += mergeSort(arr, mid + 1, high); // right half
        count += merge(arr, low, mid, high);  // merging sorted halves
        return count;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        int low = 0;
        int high = n-1 ;
        return mergeSort(arr, low, high);
        
    }
}

}
