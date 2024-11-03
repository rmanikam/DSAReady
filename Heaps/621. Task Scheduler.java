
import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char task : tasks) {
            frequencyMap.put(task, frequencyMap.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(frequencyMap.entrySet());

        int intervals = 0;

        while(!maxHeap.isEmpty()) {
            int coolDownPeriod = n + 1;
            Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
            while(!maxHeap.isEmpty() && coolDownPeriod > 0) {
                Map.Entry<Character, Integer> entry = maxHeap.poll();
                entry.setValue(entry.getValue() - 1);
                intervals += 1;
                if(entry.getValue() != 0) {       
                    queue.add(entry);
                }
                coolDownPeriod -= 1;
            }

            if(queue.size() != 0) {
                maxHeap.addAll(queue);
                intervals += coolDownPeriod;
            }
        }

        return intervals;
    }
}