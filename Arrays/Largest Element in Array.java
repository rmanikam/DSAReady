package Arrays;




class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int max = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
}