package BackTracking;

class Solution {

    public void findAllCombinations(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> ds)
    {
        int n = candidates.length;
        if(index == n)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index] <= target)
        {
            ds.add(candidates[index]);
            findAllCombinations(index, target - candidates[index], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }
        findAllCombinations(index + 1, target, candidates, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findAllCombinations(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
}