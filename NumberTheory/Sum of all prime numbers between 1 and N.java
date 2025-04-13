package NumberTheory;


class Solution
{
    public long prime_Sum(int n)
    {
        // code here
        long sum = 0;
        boolean[] isPrime = new boolean[n  + 1]; // we traverse till n as we want to include n also 
        // so that is why from 0 to n it is n + 1

        for(int i = 2; i <=n; i++)
        {
           isPrime[i] = true;
        }
        for(int i = 2; i * i <= n; i++)
        {
            if(isPrime(i) == true)
            {
                for(int j = i * i; j <=n; j+=i)
                {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                sum += i;
            }
        }


        return sum;
        
        
    }
    private boolean isPrime(int num)
    {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
        {
            if (num % i == 0) return false;
        }
        return true;
    }
}