package Arrays;

// brute force

// class Solution {
//     public int maxChunksToSorted(int[] arr) {
//         int n = arr.length;
//         int[] prefixMax = new int[n];
//         int[] suffixMin = new int[n];
       
//        for(int i = 0; i < n; i++)
//        {
//         prefixMax[i] = arr[i];
//         suffixMin[i] = arr[i];
//        }

//         for(int i = 1; i < n; i++)
//         {
//             prefixMax[i] = Math.max(prefixMax[i], prefixMax[i-1]);

//         }
//         for(int i = n-2; i >= 0; i--)
//         {
//             suffixMin[i] = Math.min(suffixMin[i], suffixMin[i+1]);
//         }
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             int pehleKaMax = i >0? prefixMax[i-1] : -1;
//             int baadKaMin = suffixMin[i];
//             if(pehleKaMax < baadKaMin)
//             {
//                 count++;
//             }
//         }
//         return count;

//     }
// }

// better sol
// class Solution {
//     public int maxChunksToSorted(int[] arr) {
//         int n = arr.length;
//         int cumSum = 0;
//         int originalSum = 0;
//        int count = 0;
//        for(int i = 0; i < n; i++)
//        {
//         cumSum = cumSum + arr[i];
//         originalSum = originalSum + i;

//         if(cumSum == originalSum)
//         {
//             count++;
//         }
//        }

//        return count;

//     }
// }

// optimal

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
       int count = 0;
       int maxTillNow = - 1;
       for(int i = 0; i < n; i++)
       {
            maxTillNow = Math.max(maxTillNow, arr[i]);

            if(maxTillNow == i)
            {
                count++;
            }
       }

       return count;

    }
}