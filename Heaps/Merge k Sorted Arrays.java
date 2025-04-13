
import java.util.*;


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int[] input: arr)
        {
            for(int nums: input)
            {
                pq.add(nums);
            }
        }
        while(!pq.isEmpty())
        {
            result.add(pq.peek());
            pq.poll();
        }
        return result;
    }
}