package GreedyAlgorithms;

import java.util.*;

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    
    class Data
    {
        int start;
        int end;
        int pos;
        Data(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    
  

   
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int N = start.length;
        Data[] arr = new Data[N];
       for (int i = 0; i < N; i++) {
            arr[i] = new Data(start[i], end[i], i + 1);
        }
        
        Arrays.sort(arr, (a,b) -> a.end - b.end);
        int count  = 1; int freeTime = arr[0].end;
        for(int i = 1; i < N; i++ )
        {
            if(arr[i].start > freeTime)
            {
                count = count + 1;
        
                freeTime = arr[i].end;
                
            }
        }
        return count;
        
    }
}


// T.C is 2*N + N log N;

// S.C is O(N);