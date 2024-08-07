package NumberTheory;
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = gcf(A, B);
        long lcm = (A* B) / gcd;
        
        return new Long[]{lcm, gcd};
          
        }
         static long gcf(Long a, Long b)
         {
              long R;
              while((a%b) > 0)
              {
                R = a%b;
                a = b;
                b = R;
              }
              return b;
          }
        
    
};