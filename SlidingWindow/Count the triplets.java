package SlidingWindow;
import java.util.Arrays;
// brute force gives tle
// class Solution {
//     int countTriplet(int arr[]) {
//         // code here
//         int count = 0;
//         Arrays.sort(arr);
//         int n = arr.length;
//         for(int i = 0; i < n-2; i++)
//         {
//             for(int j = i+1; j < n -1;j++)
//             {
//                 for(int k = j +1; k < n; k++)
//                 {
//                     if(arr[i] + arr[j] == arr[k])
//                     {
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
        
//     }
// }

// 2pointer technique

class Solution {
    int countTriplet(int arr[]) {
        // code here
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
     
        for(int k = n - 1; k >= 2; k--)
        {
            
            int i = 0; int j = k-1;
            while(i < j)
            {
                int sum = arr[i] + arr[j];
                if(sum == arr[k])
                {
                    count++;
                    i++;
                    j--;
                }
                else if(sum < arr[k])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
        }
        return count;
        
    }
}