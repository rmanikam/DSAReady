package BinarySearch;

// brute force
class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        // int count = 0;
        // for(int i = 2; i <= a*b; i++)
        // {
        //     if((i%a == 0) || (i%b == 0))
        //     {
        //         count++;
        //     }
        //     if(count == n)
        //     {
        //         return i;
        //     }
        // }
        // return 109 + 7;

//         int ans = 0;
//         int i = 1;
//         int number = 2;
//         while(i <= n)
//         {
//             if((number % a == 0) || (number % b == 0))
//             {
//                 if(i == n)
//                 {
//                     ans = number;
//                     break;
//                 }
//                 i++;
//             }
            
//             number++;
//         }
//         ans = number;
//         return ans;
//     }
// }

// optimal
class Solution {

    public long gcd(long a, long b)
    {
        while(a > 0 && b > 0)
        {
            if(a >b ) {
                a = a % b;
            }
            else
            {
                b = b % a;
            }
        }
        if(a == 0)
        {
            return b;
        }
        else
        {
        return a;
        }
    }
    public int nthMagicalNumber(int n, int a, int b) {
      
        // long mod = (long)(pow(10,9) + 7);
        long mod = (long)(1e9 + 7); 

        long left = Math.min(a, b);
        long right = (long) n * Math.min(a,b);


        long lcm = (a / gcd(a,b)) * b;

        while(left <= right)
        {
            long mid = left + (right -left) / 2;

            if((mid/a) + (mid/b) - (mid/lcm) < n)
            {
               left = mid + 1;  
            }
            else
            {
                right = mid -1;
            }
        }
        return (int)(left % mod);


    }
}
