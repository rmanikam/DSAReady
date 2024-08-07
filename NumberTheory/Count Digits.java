package NumberTheory;

class Solution{

        int evenlyDivides(int N){
            //code here
            int y = N;
            int count = 0;
            while(N > 0)
            {
                int k = N % 10;
                if( k != 0 && y % k == 0)
                {
                    count++;
                }
                N = N / 10;
            }
            return count;
        }
    };