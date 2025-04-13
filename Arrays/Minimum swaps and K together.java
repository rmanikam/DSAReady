package Arrays;

// approach1
// class Solution {
//     Function for finding maximum and value pair
//     int minSwap(int[] arr, int k) {
//         Complete the function
        
//         int bad = 0;
//         int n = arr.length;
        
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(arr[i] <= k)
//             {
//                 count++;
//             }
//         }
//         for(int i = 0; i < count; i++)
//         {
//             if(arr[i] > k)
//             {
//                 bad++;
//             }
//         }
//         int ans = bad;
//         for(int i = 0, j = count; j < n; i++, j++)
//         {
//             if(arr[j] >k)
//             {
//                 bad++;
//             }
//             if(arr[i] >k)
//             {
//                 bad--;
//             }
//             ans = Math.min(ans, bad);
//         }
//         return ans;
        
        
     
//     }

// approach2
class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        
        int bad = 0;
        int n = arr.length;
        
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] <= k)
            {
                count++;
            }
        }
        for(int i = 0; i < count; i++)
        {
            if(arr[i] > k)
            {
                bad++;
            }
        }
        int ans = bad;
        for(int i = 0, j = count; j < n; i++, j++)
        {
            if(arr[j] >k)
            {
                bad++;
            }
            if(arr[i] >k)
            {
                bad--;
            }
            ans = Math.min(ans, bad);
        }
        return ans;
        
        
     
    }
}