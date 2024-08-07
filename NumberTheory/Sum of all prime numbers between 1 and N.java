package NumberTheory;


class Solution
{
    public long prime_Sum(int n)
    {
        // code here
        long sum = 0;
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