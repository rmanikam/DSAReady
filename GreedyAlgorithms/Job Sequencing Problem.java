package GreedyAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class Solution {
    // Function to find the maximum profit and the number of jobs done.
    ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        // Your code here
        
        
    Arrays.sort(jobs, (a, b) -> Integer.compare(b.profit, a.profit));
    
      int count  = 0;
      int totalProfit = 0;

      int maxDeadline  = -1;
      
      for(int i = 0; i < n; i++)
      {
          maxDeadline = Math.max(maxDeadline, jobs[i].deadline);
      }
      
      int[] slots = new int[maxDeadline + 1];
      Arrays.fill(slots, -1);
      
      for(int i = 0; i < n; i++)
      {
          
          for(int j = jobs[i].deadline; j >=1 ; j--)
          {
              if(slots[j] == -1)
              {
                  count = count  +1;
                  totalProfit += jobs[i].profit;
                  slots[j] = i;
                  break;
              }
               
          }
      }
      ArrayList<Integer> result = new ArrayList<>();
      result.add(count);
      result.add(totalProfit);
      
      return result;
    }
}
