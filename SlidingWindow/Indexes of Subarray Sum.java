package SlidingWindow;

import java.util.ArrayList;


// brute force
// class Solution {
//     static ArrayList<Integer> subarraySum(int[] arr, int target) {
//         // code here
        
//         int sum = 0;
//         int n = arr.length;
//         ArrayList<Integer> output = new ArrayList<Integer>();
//         boolean flag = false;
//         for(int i = 0; i < n; i++)
//         { 
//             sum = 0;
//             for(int j = i; j < n; j++)
//             {
//                 sum += arr[j];
//                 if(sum == target)
//                 {
//                     output.add(i + 1);
//                     output.add(j + 1);
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag)
//             {
//                 break;
//             }
//         }
//         if(!flag)
//         {
//             output.add(-1);
//         }
//         return output;
//     }
// }

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
        int sum = 0;
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int st = 0; int end = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++)
        { 
            sum = sum + arr[i];
           
                if(sum >= target)
                {
                    end = i;
                    while(sum > target && st < end)
                    {
                        sum-=arr[st++];
                    }
                   
                }
                if(sum == target)
                {
                     al.add(st + 1);
                    al.add(end + 1);
                    flag = true;
                    break;
                }
        }
        if(!flag)
        {
            al.add(-1);
        }
        return al;
    }
}