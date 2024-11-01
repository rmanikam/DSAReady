package SlidingWindow;
import java.util.List;

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        int n = arr.size();
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            if( i < n - 1 && arr.get(i).equals(arr.get(i+1)))
            {
                continue;
            }
            else
            {
                arr.set(count, arr.get(i));
                count++;
            }
    
        }
        return count;
    }
}