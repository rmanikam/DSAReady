package NumberTheory;

// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        
           int sum = 0;
        int m = n;
        while(n > 0){
            int k = n % 10;
            sum = sum + k * k * k;
            n = n / 10;
        }
        if(m == sum)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}