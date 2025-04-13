package SlidingWindow;
import java.util.HashMap;
class Solution {
    public int subarraysWithKDistinctValues(int[]nums, int k)
    {

        int l = 0;
        int r = 0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int count = 0;

        int n = nums.length;
        while(r < n)
        {
            
             mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
             
             while(mp.size() > k)
             {
                mp.put(nums[l], mp.get(nums[l])- 1);
                if(mp.get(nums[l]) == 0)
                {
                    mp.remove(nums[l]);
                    
                }
                l = l + 1;
             }
             count += r - l  + 1;
             r = r + 1;
            
        }
        return count;


    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return subarraysWithKDistinctValues(nums, k) - subarraysWithKDistinctValues(nums, k-1);
    }
}