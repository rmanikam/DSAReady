package SlidingWindow;

// brute force

// class Solution {
//     boolean twoSum(int arr[], int target) {
         // code here
        
//         int n = arr.length;
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j<n; j++)
//             {
//                 if(arr[i] + arr[j] == target)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// better

// class Solution {
//     boolean twoSum(int arr[], int target) {
         // code here
        
//         int n = arr.length;
//         HashMap<Integer, Integer> hm = new HashMap<>();
       
//         for(int i = 0; i < n; i++)
//         {
//             int a = arr[i];
//             int rem = target -arr[i];
//             if(hm.containsKey(rem))
//             {
//                 return true;
//             }
//             hm.put(a, i);
           
//         }
//         return false;
//     }
// }

// optimal



// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        int n = arr.length;
        int left = 0;
        int right = n -1;
       
       Arrays.sort(arr);
        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                return true;
            }
            else if(sum < target)
            {
                left++;
            }
            else{
                right--;
            }
           
        }
        return false;
    }
}