package Arrays;

import java.util.ArrayList;

// brute force
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> maxProduct = new ArrayList<Integer>();
        for(int i = 0; i <= n - k; i++)
        {
            int maximum = arr[i];
            for(int j = 1; j < k; j++)
            {   
                
                maximum = Math.max(maximum, arr[i+j]);
                
            }
            maxProduct.add(maximum);
        }
        return maxProduct;
        
    }
}