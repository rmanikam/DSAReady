package NumberTheory;

class Solution {
    public int countPrimes(int n) {
        
        int count = 0;
        for(int i = 2; i < n; i++)
        {
             int j = 2;
             while(j < i)
             {
                if(i % j == 0)
                {
                    break;
                }
                j++;
             }
             if(j == i)
             {
                count++;
             }
        }
        return count;
    }
}