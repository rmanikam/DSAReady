package NumberTheory;

class Solution {
    public int addDigits(int num) {
         int a = 0;
        while(num != 0)
        {
            a = a + num %10;
            num = num / 10;
            if(num == 0 && a >= 10)
            {
                num = a;
                a = 0;
            }
        }
        return a;
    }
}
