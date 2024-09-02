package Arrays;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// Brute Force
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
 
//         int n = nums.length;
//         Set<List<Integer>> set = new HashSet<>();
//         for(int i = 0; i < n; i++)
//         { 
//             for(int j = i + 1; j < n; j++)
//             { 
//                 for(int k = j + 1; k < n; k++)
//                 {
//                     for(int l = k + 1; l < n; l++)
//                     {
//                         long sum = nums[i] + nums[j];
//                          sum += nums[k];
//                          sum += nums[l];
//                         if(sum == target)
//                         {
//                             List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[k], nums[l]);
//                             Collections.sort(temp);
//                             set.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList <>(set);
//         return ans;
//     }
// }


// Better Solution

// import java.util.*;
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         Set<List<Integer>> set = new HashSet<>();
//         for(int i = 0; i < n; i++)
//         {
            
//             for(int j = i + 1; j < n; j++)
//             {
//                 Set<Long> setNew = new HashSet<>();
//                 for(int k = j + 1; k < n; k++)
//                 {
//                      long sum = (long) nums[i] + nums[j] + nums[k];

//                     long fourth = (long)target - sum;

//                     if(setNew.contains(fourth))
//                     {
//                         List<Integer> temp =  Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
//                         Collections.sort(temp);
//                         set.add(temp);

//                     }
//                     setNew.add((long)nums[k]);
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }
// }

// optimal solution

import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<> ();
        for(int i = 0; i < n; i++)
        {
            if(i> 0 && nums[i] == nums[i-1] ) continue;
            for(int j = i+1; j < n; j++)
            {
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j + 1;
                int right = n - 1;

                 while(left < right )
                 {
                    long sum = nums[i]; 
                    sum += nums[j] ;
                    sum += nums[left];
                    sum += nums[right];
                    if(sum == (long)target)
                    {
                     List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[left], 
                      nums[right]);
                        ans.add(temp);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    }
                    else if(sum < (long)target)
                    {
                        left++;
                    }
                    else right--;
                 }
            }
        }
        return ans;
    }
}