package Arrays;

// brute force



// class Solution {
    
//     public long countSubArrayProductLessThanK(long a[], int n, long k)
//     {
//         long count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             long prod = 1;
//             for(int j = i; j < n; j++)
//             {
//                 prod = prod * a[j];
//                 if(prod < k)
//                  {
//                     count++;
//                  }
//                  else
//                  {
//                      break;
//                  }
//             }
//         }
//         return count;
//     }
// }


// optimal sol using sliding window

class Solution {
    
    public long countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long start = 0;
        long end = 0;
        long p = 1;
        long count = 0;
        
        while(end < n)
        {
            p = p * a[(int)end];
            while(start < n && p >= k)
            {
                p = p / a[(int)start];
                start++;
            }
            if(p < k)
            {
                count = count + (end - start + 1);
            }
           
            end++;
        }
        return count;
    }
}
