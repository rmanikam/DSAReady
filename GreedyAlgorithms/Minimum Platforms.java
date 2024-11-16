package GreedyAlgorithms;
import java.util.Arrays;
// Brute Force

// class Solution {
//     // Function to find the minimum number of platforms required at the

//     static int findPlatform(int arr[], int dep[]) {
//         int maxCount = 0;  
//         int n = arr.length;


//         for (int i = 0; i < n; i++) {
//             int count = 1; 

           
//             for (int j = i + 1; j < n; j++) {
             
//                 if (dep[j] < arr[i] && arr[j] > arr[n - 1]) {
//                     count++;
//                 }
               
//                 else if (dep[j] < arr[i] && arr[j] < arr[n - 1]) {
//                     count++;
//                 }
//                 else if (dep[j] > arr[i] && arr[j] > arr[n - 1]) {
//                     count++;
//                 }
                
//                 else if (dep[j] > arr[i] && arr[j] < arr[n - 1]) {
//                     count++;
//                 }
//             }

  
//             maxCount = Math.max(maxCount, count);
//         }


//         return maxCount;
//     }

   
// }


// optimal sol

class Solution {
    // Function to find the minimum number of platforms required at the

    static int findPlatform(int arr[], int dep[]) {
        int maxCount = 0;  
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < n)
        { 
            if(arr[i] <= dep[j])
            {
                count++;
                i = i  +1;
            }
            else
            {
                count--;
                j = j + 1;
            }
                maxCount = Math.max(maxCount, count);
        }
    
        return maxCount;
    }

   // t.c is O(2 (N log N + N))
   // s.c is O(1);
}