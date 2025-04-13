package BinarySearch;

class Solution {
    int lessThanK(int el, int m, int n)
    {
        int sum = 0;
        for(int i = 1; i <=m; i++)
        {
            sum += Math.min(el/i, n);

        }
        return sum;
    }
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m *n;
        while(low <= high)
        {
            int mid = low + (high -low)/ 2;
            if(lessThanK(mid, m, n) < k)
            {
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        return low;



    }
}