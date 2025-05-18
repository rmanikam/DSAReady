package BackTracking;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    private void solve(int start, int k, int n, List<Integer> temp)
    {
        if(k ==0){
           res.add(new ArrayList<>(temp));
           return;
        }
        if(start > n) return;         
        temp.add(start);
        
        solve(start + 1, k-1, n, temp);
        temp.remove(temp.size()-1);
        solve(start + 1, k, n, temp);
         
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();    
        solve(1, k, n, temp );

        return res;


    }
}
