package Arrays;

import java.util.List;

// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        
        int largest = 0;
        int secondLargest = 0;
        
        for(int i = 0 ; i < arr.size(); i++)
        {
            int num = arr.get(i);
            if(largest < num)
            {
                secondLargest = largest;
                largest = num;
            }
            else if( secondLargest < num && num < largest  )
            {
                secondLargest = num;
              
            }
        }
        return secondLargest;
    }
}