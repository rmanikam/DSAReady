package NumberTheory;
    

class Solution{
    static int isPrime(int N){
        // code here
     
     if(N <= 1)
     {
         return 0;
     }
     int i = 2;
    
  
     
     while(i * i <= N)
     {
         if(N%i == 0)
         {
             return 0;
         }
         i++;
     }
     return 1;
    }

}
