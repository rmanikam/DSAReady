package BackTracking;

class Solution {

    public void helper(int index, int sum, int k, int n, List<List<Integer>> ans, List<Integer> ans2) {
        if(sum == n && k == 0)
        {
            ans.add(new ArrayList <>(ans2));
            return;
        }
            if(sum > n)
            {
                return;
            }
            for(int i = index; i <= 9; i++)
            {
                ans2.add(i);
                helper(i + 1 ,sum + i, k -1, n, ans, ans2);
                ans2.remove(ans2.size() - 1);
            }
            
    
    
        }
    
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> ans2 = new ArrayList<>();
            helper(1,0, k, n, ans, ans2);
            return ans;
    
        }
    }
