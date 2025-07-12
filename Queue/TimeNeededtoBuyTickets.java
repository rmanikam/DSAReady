package Queue;

//brute force
// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         Queue<Integer> q = new LinkedList<>();
//         for (int i = 0; i < tickets.length; i++) {
//             q.add(i);
//         }
//         int timeNeeded = 0;
//         while (!q.isEmpty()) {
//             timeNeeded++;
//             int front = q.peek();
//             q.poll();
//             tickets[front]--;
//             if (k == front && tickets[front] == 0) {
//                 return timeNeeded;
//             }
//             if (tickets[front] != 0) {
//                 q.add(front);
//             }

//         }
//         return timeNeeded;
//     }
// }

// optimal sol

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeNeeded = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                timeNeeded += Math.min(tickets[k], tickets[i]);
            } else {
                timeNeeded += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        return timeNeeded;
    }
}