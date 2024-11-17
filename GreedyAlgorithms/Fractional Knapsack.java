package GreedyAlgorithms;
import java.util.List;
import java.util.Arrays;

// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        
      
        
    
        int n = val.size();
        
          double [][] arr = new double[n][3];
        
        for(int i = 0; i < n; i++)
        {
            arr[i][0] = (double) val.get(i)/ wt.get(i);
            arr[i][1] = val.get(i);
            arr[i][2] = wt.get(i);
        }
        
            Arrays.sort(arr, (a, b) -> Double.compare(b[0], a[0]));
            
           
        double maxValue = 0.0;
        
        for(int i = 0; i < n; i++)
        {
            int weight = (int)(arr[i][2]);
            int value  = (int)(arr[i][1]);
            
            if(weight < capacity)
            {
                maxValue += value;
                capacity = capacity - weight;
            }
            else
            {
                maxValue += arr[i][0] * capacity;
                capacity = 0;
                break;
            }
        }
        return maxValue;
    }
}

// t.c is O(N + n log N)
// s.c is O(1);