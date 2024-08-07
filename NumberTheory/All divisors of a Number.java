package NumberTheory;



class Solution {
    public static void print_divisors(int n) {
        // code here
        
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}