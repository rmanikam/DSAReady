package Arrays;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++)
        {
             int res= A.get(i) * A.get(i);
             arr.add(res);
        }
        Collections.sort(arr);
        return arr;
    }
}
