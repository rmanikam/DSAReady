package Stacks;

// brute force

import java.util.ArrayList;

class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> output = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++)
        {
            int j = i;
            int count = 0;
            while(j >= 0)
            {
                if(arr[i] >= arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
                j--;
            }
            output.add(count);
            
            
        }
        return output;
    }
}