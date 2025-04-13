package Arrays;
// brute force



// class Solution {



//     public int circularSubarraySum(int arr[]) {

//         int n = arr.length;
//         int res = arr[0];
//         for(int i = 0; i < n; i++)
//         {
//             int currSum = 0;
//             for(int j = 0; j < n; j++)
//             {
//                 int idx = (i + j) % n;
//                 currSum += arr[idx];
//                 res = Math.max(currSum, res);
//             }
//         }
//         return res;
//     }
// }

// optimal





class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    
    private int kadanes(int[] a){
        int n = a.length;
        int sum = a[0], answer = a[0];
        for(int i=1; i<a.length; i++){
            sum += a[i];
            if(sum < a[i]) sum = a[i];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public int circularSubarraySum(int arr[]) {

        // Your code here
         if(arr.length == 0) return 0;
        int x = kadanes(arr);
        int y = 0;
        for(int i=0; i<arr.length;i++){
            y += arr[i];
            arr[i] *= -1;
        }
        int z = kadanes(arr);
        if(y+z == 0) return x;
        return  Math.max(x, y+z);
    }
}