package NumberTheory;

class Solution {

    int evenlyDivides(int N) {
        // code here
        int y = N;
        int count = 0;
        while (y > 0) {
            int k = y % 10;
            if (k != 0 && N % k == 0) {
                count++;
            }
            y = y / 10;
        }
        return count;
    }
};