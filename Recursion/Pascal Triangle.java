package Recursion;

import java.util.ArrayList;

// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        if(n == 1)
        {
             ArrayList<Long> output = new ArrayList<Long>();
             output.add(1L);
             return output;
            
        }
          // Get the previous row
        ArrayList<Long> previousRow = nthRowOfPascalTriangle(n - 1);
        ArrayList<Long> currentRow = new ArrayList<Long>();
        
         // First element of the row is always 1
        currentRow.add(1L);
   
        // Calculate the intermediate elements
        for (int i = 1; i < previousRow.size(); i++) {
            long sum = (previousRow.get(i - 1) + previousRow.get(i))%1000000007;
            currentRow.add(sum);
        }

        // Last element of the row is always 1
        currentRow.add(1L);

        return currentRow;
        
       
    }
}