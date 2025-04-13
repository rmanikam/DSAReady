package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
        {
            return intervals;
        }
        // This lambda expression compares the first element (a[0]) of one sub-array 
        //    with the first element (b[0]) of another sub-array.
        // The sorting will be done in ascending order based on the first element of each 
        //   sub-array.
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List <int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
         result.add(newInterval);
        for(int[] interval : intervals)
        {
            if(interval[0] <= newInterval[1])
            {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else
            {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        int [][] resultArray = new int[result.size()][];
        return result.toArray(resultArray);
    }
}

// TimeComplexity is O(nlogn) + O(2n)

// Space Complexity is O(n)