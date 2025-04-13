package NumberTheory;
// Count Primes using Sieve of Eratosthenes algorithm.

class Solution {
    public int countPrimes(int n) {
        if(n < 2)
        {
            return 0;
        }
        boolean[] composites = new boolean[n];
        double m = Math.sqrt(n);
        for(int i = 2; i<= m; i++)
        {
           if(composites[i] == false)
           {
                 for(int j = i * i; j < n; j+=i)
                 {
                    composites[j] = true;
                 }   
           }
           

        }
        int count = 0;
        for(int i = 2; i < n; i++)
        {
            if(composites[i] == false)
            {
              count++;
            }
        }
        return count;

    }
}