package Sorting;



// User function Template for Java

class Solution {
    // ist approach
    // void segregateEvenOdd(int arr[]) {
        // code here
        
    //     int n = arr.length;
    //     int k = 0;
    //     int[] evenArr = new int[n];
    //     int[] oddArr = new int[n];
    //     int evenCount = 0, oddCount = 0;

    //     // First pass: Collect even and odd numbers separately
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] % 2 == 0) {
    //             evenArr[evenCount++] = arr[i];
    //         } else {
    //             oddArr[oddCount++] = arr[i];
    //         }
    //     }

    //     // Sort both arrays
    //     Arrays.sort(evenArr, 0, evenCount);
    //     Arrays.sort(oddArr, 0, oddCount);

    //     // Merge sorted evens and sorted odds back into arr
    //     for (int i = 0; i < evenCount; i++) {
    //         arr[k++] = evenArr[i];
    //     }
    //     for (int i = 0; i < oddCount; i++) {
    //         arr[k++] = oddArr[i];
    //     }
    
    // }

    // 2nd approach


// User function Template for Java

class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int n = arr.length;
         int start = 0, end = n - 1;
        
        while (start <= end) {
            // Find an odd number at left
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if (arr[start] % 2 == 0 && arr[end] % 2 != 0) {
                start++;
                end--;
            }
            else if (arr[start] % 2 == 0) {
                start++;
                
            }
            else
            {
               end--; 
            }
        }
        Arrays.sort(arr, 0, start);
        Arrays.sort(arr, start, n);
    
    }
}
}
