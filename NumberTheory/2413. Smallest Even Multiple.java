package NumberTheory;

class Solution {
    public int smallestEvenMultiple(int n) {
         int y = 2;
         int ans = 0;
         for(int i = 1; i <= 150; i++)
         {
            int j;
            for(j = 1; j <= 150; j++)
            {
                if( y * j == n * i)
                {
                   ans = y * j;
                   break;
                }
            }
            if( y * j == n * i)
            {
                ans = y * j;
                break;
            }
         }
         return ans;
    }
}