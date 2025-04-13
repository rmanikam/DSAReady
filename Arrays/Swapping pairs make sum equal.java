package Arrays;

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int sum1 = 0;
        int sum2 = 0;
        int n = a.length;
        int n1 = b.length;
        for(int i = 0; i < n; i++)
        {
            sum1 = sum1 + a[i];
        }
        
        for(int j = 0; j < n1; j++)
        {
            sum2 = sum2 + b[j];
        }
        
        for(int i = 0, j = 0; i < n && j < n1;)
        {
            int newSum1 = sum1 -a[i] + b[j];
            int newSum2 = sum2 - b[j] + a[i];
            if(newSum1 > newSum2)
            {
                i++;
            }
            else if(newSum2 > newSum1)
            {
                j++;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}

