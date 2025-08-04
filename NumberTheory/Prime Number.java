package NumberTheory;

// class Solution{
//     static int isPrime(int N){
// code here

//      if(N <= 1)
//      {
//          return 0;
//      }
//      int i = 2;

//      while(i * i <= N)
//      {
//          if(N%i == 0)
//          {
//              return 0;
//          }
//          i++;
//      }
//      return 1;
//     }

// }

class Solution {
    static boolean isPrime(int n) {
        // code here
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }
}
