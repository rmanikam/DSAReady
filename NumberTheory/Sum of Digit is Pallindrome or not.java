package NumberTheory;
// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        
           
        int sum = 0;
        int k = n;
     
        while(k!=0)
        {
            sum = sum + k%10;
            k = k / 10;
        }
        int j = sum;
        int r = 0;
        while(j!=0)
        {
            r = r *10 + j%10;
            j = j / 10;
        }
        if(sum == r)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}