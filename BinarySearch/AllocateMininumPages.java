package BinarySearch;

class Solution {
    
    public static int helper(int[]arr, int pages)
    {
        int pagesStudent = 0;
        int stud = 1;
        for(int i = 0; i <arr.length;i++)
        {
            if(pagesStudent + arr[i] <= pages)
            {
                pagesStudent+= arr[i];
            }
            else
            {
                stud++;
                pagesStudent = arr[i];
            }
        }
        return stud;
    }
    public static int calcSum(int[]arr)
    {
       int sum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum+= arr[i];
       }
       return sum;
    }
    public static int calcMax(int[]arr)
    {
        int maxValue = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++)
       {
           if(maxValue < arr[i])
           {
               maxValue = arr[i];
           }
       }
       return maxValue;
    }
    
    public static int findPages(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        if(k> n)
        {
            return -1;
        }
        
        int low = calcMax(arr);
        int high  = calcSum(arr);
        
        while(low <= high)
        {
            int mid = low + (high-low)/ 2;
            int calStudent = helper(arr,mid);
            if(calStudent >k)
            {
               low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low;
        
    }
}
