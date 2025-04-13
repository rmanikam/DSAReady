package NumberTheory;
class Solution {
  // Eucledian Algorithm
  static Long[] lcmAndGcd(Long A , Long B) {
      // code here
      long gcd = 1;
      long C = A;
      long D = B;
    while ( C > 0 && D > 0)
    {
        if( C > D)
        {
            C = C % D;
        }
        else
        {
            D = D % C;
        }
    }
    if( C == 0)
    {
        gcd = D;
    }
    else
    {
       gcd = C; 
    }
    
    
    
    long lcm = (A * B) / gcd;
    return new Long[]{lcm, gcd};
  }

};