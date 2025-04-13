package Arrays;




// class Solution {
// Function to find equilibrium point in the array.
//     public static int findEquilibrium(int arr[]) {

//  brute force
    // int i = 1;
    // int n = arr.length;
    // while(i < n - 1)
    // {
    //     int sum = 0;
    //     int sum1 = 0;
    //     int j = i - 1;
    //     while(j >= 0)
    //     {
    //         sum = sum + arr[j];
    //         j--;
    //     }
    //     int k = i + 1;
    //     while(k < n)
    //     {
    //         sum1 = sum1 + arr[k];
    //         k++;
    //     }
    //     if(sum == sum1)
    //     {
    //         return i;
    //     }
    //     i++;
    // }
    // return -1;
        // optimal approach
        int n = arr.length;
        int[] sum = new int[n];
        for(int i = 0; i <n; i++)
        {
            sum[i] = 0;
        }
        int total = 0;
        for(int i = 0; i <n; i++)
        {
            if(i == 0)
            {
                sum[i] = arr[0];
                
            }
            else
            {            
                sum[i] = sum[i - 1] + arr[i];
               
            }
            total = total + arr[i];
        }
        for(int i = 1; i < n; i++)
        {
            int lSum = sum[i] - arr[i];
            int rSum = total - sum[i];
            if(lSum == rSum)
            {
                return i;
            }
        }
        return -1;
    }
}