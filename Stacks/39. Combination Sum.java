package Stacks;
import java.util.List;
import java.util.ArrayList;

class Solution {

    private void findCombination(int index, int[] candidates, int target,List<List<Integer>> ans, List<Integer> ds)
    {
        if(index == candidates.length)
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
            findCombination(index, candidates, target-candidates[index], ans, ds );
            ds.remove(ds.size()-1);
        }
        findCombination(index + 1, candidates, target, ans, ds );

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>() );
        return ans;
    }
}
