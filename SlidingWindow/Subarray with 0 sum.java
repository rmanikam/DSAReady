package SlidingWindow;
import java.util.HashSet;
// this gives tle
// class Solution {
//     // Function to check whether there is a subarray present with 0-sum or not.
//     static boolean findsum(int arr[]) {
//         // Your code here
        
        
//         int sum = 0;
//         int n = arr.length;
//         for(int i = 0; i < n; i++)
//         {
//             sum = 0;
//             for(int j = i; j < n; j++)
//             {
//                 sum = sum +arr[j];
//                 if(sum == 0)
//                 {
//                     return true;
                  
//                 }
               
//             }
           
//         }
       
//             return false;
        
        
//     }
// }

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        
        
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int number: arr)
        {
           
           sum = sum + number;
           
           if(sum == 0 || set.contains(sum) )
           {
               return true;
           }
           
           set.add(sum);
        }
       
            return false;
        
        
    }
}