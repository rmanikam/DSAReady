 package BinarySearch;
// class Solution {

//     public boolean canWePlace(int[] arr, int dist, int cows)
//     {
//         int countCows = 1; int last = arr[0];
//         for(int i = 1; i < arr.length; i++ )
//         {
//              if(arr[i] - last >= dist)
//              {
//                 countCows++;
//                 last = arr[i];
//              }
//              if(countCows == cows)
//              {
//                 return true;
//              }
//         }
//         return false;

        
//     }
//     public int aggressiveCows(int[] arr, int cows)
//     {
//         for(int i = 1; i <= arr.length; i++ )
//         {
//             if(canWePlace(arr, i, cows) == true)
//             {
//                 continue;
//             }
//             else{
//                 return i - 1;
//             }
//         }
//         return -1;
//     }
// }

// T.C is O(max - min) * O(n)
// SC is O(1)
// optimal solution

import java.util.*;

class Main
{
    // Function to check if we can place cows with at least 'dist' distance apart
    public static boolean canWePlace(int[] stalls, int dist, int cows)
    {
        int countCows = 1; // Place first cow in the first stall
        int last = stalls[0]; // Last cow placed at the first stall
        
        for(int i = 1; i < stalls.length; i++)
        {
            if(stalls[i] - last >= dist) // If the current stall is at least 'dist' away from the last placed cow
            {
                countCows++;
                last = stalls[i];
            }
            if(countCows == cows) // If we have placed all cows
            {
                return true;
            }
        }
        return false; // If unable to place all cows
    }
    
    // Function to find the largest minimum distance
    public static int aggrCows(int[] stalls, int cows)
    {
        Arrays.sort(stalls); // Sort the stalls first
        int low = 1; // Minimum possible distance
        int high = stalls[stalls.length-1] - stalls[0]; // Maximum possible distance
        int ans = 0;
        
        // Binary search for the maximum minimum distance
        while(low <= high)
        {
            int mid = low + (high - low) / 2; // Midpoint of low and high
            if(canWePlace(stalls, mid, cows)) // If we can place cows with at least 'mid' distance
            {
                ans = mid; // Update the answer
                low = mid + 1; // Try for a larger distance
            }
            else
            {
                high = mid - 1; // Try for a smaller distance
            }
        }
        return ans; // Return the largest minimum distance
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-- > 0)
        {
            int N = sc.nextInt(); // Number of stalls
            int C = sc.nextInt(); // Number of cows
            int[] stalls = new int[N];
            
            // Input stall locations
            for(int i = 0; i < N; i++)
            {
                stalls[i] = sc.nextInt();
            }
            
            // Find the largest minimum distance
            int output = aggrCows(stalls, C);
            System.out.println(output);
        }
        sc.close();
    }
}

// T.C is nlogn + O(log 2(range) * O(n))
// SC is O(1)