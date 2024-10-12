package Stacks;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {

    public void computeUniqueSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> res,  Map<List<Integer>, Boolean>  map)
        { 
             if (!map.containsKey(curr)) {
                
                res.add(new ArrayList<>(curr));
                map.put(new ArrayList(curr), true);
            }
              for(int i = index; i < nums.length; i++)
              {
                curr.add(nums[i]);
                computeUniqueSubsets(i + 1, nums, curr, res, map);
                curr.remove(curr.size()-1);
                
                
              }
        }
        public List<List<Integer>> subsetsWithDup(int[] nums) {
             List<List<Integer>> res = new ArrayList();
             Map<List<Integer>, Boolean> map = new HashMap<>();
              Arrays.sort(nums);
              computeUniqueSubsets(0, nums, new ArrayList(), res, map);
            return res; 
        }
    }