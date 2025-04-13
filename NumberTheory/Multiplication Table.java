package NumberTheory;

import java.util.ArrayList;

//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        
        ArrayList<Integer> arr = new ArrayList<Integer>(N);
      
        for(int i = 1; i <= 10; i++)
        {
            arr.add(N * i);
        }
        
        return arr;
    }
}