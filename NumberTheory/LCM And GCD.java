package NumberTheory;
// class Solution {
// Subtractive Method(Eucledian Algorithm)
// static Long[] lcmAndGcd(Long A , Long B) {
// code here
// long gcd = 1;
// long C = A;
// long D = B;
// while ( C > 0 && D > 0)
// {
// if( C > D)
// {
// C = C % D;
// }
// else
// {
// D = D % C;
// }
// }
// if( C == 0)
// {
// gcd = D;
// }
// else
// {
// gcd = C;
// }
// T.C is O(log(max(a,b))) and Space Complexity is O(1)

// long lcm = (A * B) / gcd;
// return new Long[]{lcm, gcd};
// }

// };

// Modulus Method(Eucledian Algorithm)

// class Solution {
// static Long[] lcmAndGcd(Long A , Long B) {
// code here
// long gcd = gcf(A, B);
// long lcm = (A* B) / gcd;

// return new Long[]{lcm, gcd};

// }
// static long gcf(Long a, Long b)
// {
// long R;
// while((a%b) > 0)
// {
// R = a%b;
// a = b;
// b = R;
// }
// return b;
// }

// };
// T.C is O(log(min(a,b))) and Space Complexity is O(1)

// 3rd approach

// class Solution {
// public static int[] lcmAndGcd(int a, int b) {
// code here
// int x = Math.min(a, b);
// int i = 1;
// int gcd = 0;
// while(i <= x)
// {
// if(a % i == 0 && b % i == 0)
// {
// gcd = i;
// }
// i++;

// }
// int[] arr = new int[2];

// int lcm = a * b / gcd;
// arr[0] = lcm;
// arr[1] = gcd;
// return arr;
// }
// }

// T.C is O(min(a,b)) and Space Complexity is O(1)
