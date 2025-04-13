package Arrays;



// User function Template for Java
// class Solution {
    // int missingNumber(int arr[]) {
  
    //  brute force
    //     int N = arr.length + 1;
    //     for (int i = 1; i <= N; i++) {

    //         flag variable to check
    //         if an element exists
    //         int flag = 0;

    //         Search the element using linear search:
    //         for (int j = 0; j < N - 1; j++) {
    //             if (arr[j] == i) {

    //                  i is present in the array:
    //                 flag = 1;
    //                 break;
    //             }
    //         }

    //         check if the element is missing
    //         i.e flag == 0:

    //         if (flag == 0) return i;
    //     }


    //     return -1;
    // }
// }
   // better approach


// User function Template for Java
// class Solution {
//     int missingNumber(int arr[]) {
//         int N = arr.length + 1;
//         int[] hash = new int[N+1];
//         for (int i = 0; i < N-1; i++) {

//             hash[arr[i]]++;
//         }
//         for (int i = 1; i <= N ; i++) 
//         {
//             if (hash[i] == 0) 
//             {
//                 return i;
//             }
//         }
        
//         return -1;
//     }
// }

// }

// optimal approach


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int N = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;
        int i;
        for(i = 0; i < N-1; i++)
        {
           xor1 = xor1 ^ arr[i];
           xor2 = xor2 ^  (i + 1);
        }
        xor2 = xor2 ^ N;
        
        int res = xor1 ^ xor2;
        return res;
    }
}