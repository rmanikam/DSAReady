package SlidingWindow;

// brute force
// class Solution {

//     int countPairs(int arr[], int target) {
//         Complete the function
//          int n = arr.length;
//          int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j<n; j++)
//             {
//                 if(arr[i] + arr[j] == target)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
        
//     }
// }

// better

// class Solution {

//     int countPairs(int arr[], int target) {
//         Complete the function
//         int n = arr.length;
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
            
//             int rem = target -arr[i];
//             if(hm.containsKey(rem))
//             {
//                 count += hm.get(rem);
//             }
//             hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
           
//         }
//         return count;
        
//     }
// }

// optimal


// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length;
        int left = 0;
        int right = n -1;
        int res = 0;
       
        while(left < right)
        {
           
            
            if(arr[left] + arr[right] < target)
            {
                left++;
            }
            else if(arr[left] + arr[right] > target){
                right--;
            }
            else
            {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left];
                int ele2 = arr[right];
                while(left <= right && arr[left] == ele1 )
                {
                    cnt1++;
                    left++;
                }
                while(left<= right && arr[right] == ele2)
                {
                    cnt2++;
                    right--;
                }
                
                if(ele1 == ele2)
                {
                   res = res + (cnt1 * (cnt1 - 1)) / 2; 
                }
                else
                {
                    res = res + (cnt1 * cnt2);
                }
            
            
            }
           
        }
        return res;
        
    }
}

