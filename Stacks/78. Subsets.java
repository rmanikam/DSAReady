package Stacks;
import java.util.List;
import java.util.ArrayList;



// class Solution {


// Iterative approach
// public List<List<Integer>> subsets(int[] nums) {
//     List<List<Integer>> res = new ArrayList();
//     res.add(new ArrayList());
//     for(int num:nums)
//     {
//         int n = res.size();
//         for(int i = 0; i < n; i++)
//         {
//          List<Integer> temp = new ArrayList(res.get(i));
//          temp.add(num);
//          res.add(temp);
//         }
//     }
//     return res;

    
//   }
// }


class Solution {
    // Recursive approach
    public void computeSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> res)
    { 
          res.add(new ArrayList(curr));
          for(int i = index; i < nums.length; i++)
          {
            curr.add(nums[i]);
            computeSubsets(i + 1, nums, curr, res);
            curr.remove(curr.size()-1);
            
            
          }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        computeSubsets(0, nums, new ArrayList(), res);
        return res;   
        }
    }