package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// brute force
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         List<List<Integer>> res = new ArrayList<>();
//         Set<List<Integer>> st = new HashSet<>();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j < n; j++)
//             {
//                 for(int k = j + 1; k < n; k++)
//                 {
//                     if(nums[i] + nums[j] + nums[k] == 0)
//                     {
//                     List<Integer> triplet = new ArrayList<>();
//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);
//                         Collections.sort(triplet);
//                         st.add(triplet);
//                     }
//                 }
//             }
//         }
//         res.addAll(st);
//         return res;
//     }
// }

// better
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         List<List<Integer>> res = new ArrayList<>();
//         Set<List<Integer>> st = new HashSet<>();

//         for(int i = 0; i < n; i++)
//         {
//             Set<Integer> hashSet = new HashSet<>();
//             for(int j = i + 1; j < n; j++)
//             {
//                 int third = -(nums[i] + nums[j]);
//                 if(hashSet.contains(third))
//                 {
//                    List<Integer> triplet = new ArrayList<>();
//                    triplet.add(nums[i]);
//                    triplet.add(nums[j]);
//                    triplet.add(third);
//                    Collections.sort(triplet);
//                    st.add(triplet);
//                 }
//                 hashSet.add(nums[j]);
//             }
//         }
//         res.addAll(st);
//         return res;
//     }
// }

// optimal

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                }
            }
        }
        return ans;
    }
}