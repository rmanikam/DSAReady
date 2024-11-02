package Heaps;

import java.util.PriorityQueue;

class Solution {
    public long minCost(long[] arr) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long rope : arr) {
            minHeap.add(rope);
        }
        long cost = 0;
        while (minHeap.size() >= 2) {
            long first = minHeap.poll();
            long second = minHeap.poll();
            long newRope = first + second;
            cost += newRope;
            minHeap.add(newRope);
        }
        return cost;
    }
}
