package Recursion;

class Solution {

    int[] Series(int n) {
        // code here
        
        if( n == 0)
        {
           
            return new int[]{0};
        }
        if(n == 1)
        {
            return new int[]{0, 1};
        }
        
        
        int[] y = Series(n-1);
        
        int[] arr= new int [n +1];
      
        for(int i = 0; i < y.length; i++)
        {
            arr[i] = y[i];
        }
        
        arr[n] = (y[n-1] + y[n-2]) % 1000000007;
        return arr;
    }
}