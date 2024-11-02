
import java.util.*;
class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> kLargest(int arr[], int k) {
        // write code here
        int n = arr.length;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            pq.add(arr[i]);
            
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        while(pq.size() > 0)
        {
            output.add(pq.peek());
            pq.poll();
        }
         Collections.reverse(output);
        return output;

        
    }
}
