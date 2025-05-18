package BackTracking;

class Solution {
    private void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, boolean[] used )
    {
          if(tempList.size() == nums.length && !resultList.contains(tempList))
            {
                resultList.add(new ArrayList<>(tempList));
                return;
            }


        for(int i = 0; i < nums.length; i++)
        {
        
            if(used[i])
            {
                continue;
            }
            tempList.add(nums[i]);
            used[i] = true;

            backtrack(resultList, tempList, nums, used);
             
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        
        Arrays.sort(nums);

        backtrack(resultList,new ArrayList<>(), nums, new boolean[nums.length]);

        return resultList;
    }
}
