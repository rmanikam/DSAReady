package BinarySearch;

class Solution {

    public int getDays(int[] weights, int capacity)
    {
        int days = 1;
        int load = 0;
        for(int i = 0; i < weights.length; i++)
        {
            if( load + weights[i] > capacity)
            {
               days++;
               load = weights[i];
            }
            else
            {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < weights.length; i++)
        {
            sum = sum + weights[i];
            maximum = Math.max(maximum, weights[i]);
        }
         int low =maximum;
         int high = sum;
         while(low <= high)
         {
            int mid = low + (high - low) / 2;
            int getNoOfDays = getDays(weights,mid);

            if( getNoOfDays <= days)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
         }
         return low;
        
         
    }
}