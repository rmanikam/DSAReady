package NumberTheory;


//User function Template for Java

class Solution {
    static int countSquares(int N) {
        // code here
        int i = 1;
        int count = 0;
        while(i * i < N)
        {
            count++;
            i++;
        }
        return count;
    }
}