package NumberTheory;

import java.util.ArrayList;

// class Solution {
//     public static void print_divisors(int n) {
        // code here
        
//         for(int i = 1; i <= n; i++)
//         {
//             if(n % i == 0)
//             {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


class Solution {
    public static void print_divisors(int n) {
        // code here
           ArrayList<Integer> smallerDivisors = new ArrayList<>();
           ArrayList<Integer> largerDivisors = new ArrayList<>();
        
        for(int i = 1; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                 smallerDivisors.add(i);
                if(n/i != i)
                {
                   largerDivisors.add(n / i);
                }
              
                   
               
            }
        }
        
        for(int i = 0; i < smallerDivisors.size(); i++)
        {
            System.out.print(smallerDivisors.get(i) + " ");
        }
        
        for(int i = largerDivisors.size() - 1; i >= 0; i--)
        {
            System.out.print(largerDivisors.get(i) + " ");
        }
    }
}
