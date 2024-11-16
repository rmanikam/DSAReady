package GreedyAlgorithms;

import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0;
        int r = 0;
        int m = s.length;
        int n = g.length;
        while(l < m && r < n)
        {
             if( g[r] <= s[l])
             {
                r++;
             }
             l++;
        }
        return r;
    }
}

// t.c is O(N log N + M log M + M)
// s.c is O(1)