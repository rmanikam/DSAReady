package NumberTheory;
// Count Primes using Sieve of Eratosthenes algorithm.

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }

        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int i) {
        int j = 2;
        while (j * j <= i) {
            if (i % j == 0) {
                return false;
            }
            j++;
        }
        return true;
    }
}