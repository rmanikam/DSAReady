package Stacks;
import java.util.ArrayList;
import java.util.Stack;

// brute force

// class Solution {
//     // Function to calculate the span of stock's price for all n days.
//     public ArrayList<Integer> calculateSpan(int[] arr) {
//         // write code here
//         ArrayList<Integer> output = new ArrayList<Integer>();
        
//         for(int i = 0; i < arr.length; i++)
//         {
//             int j = i;
//             int count = 0;
//             while(j >= 0)
//             {
//                 if(arr[i] >= arr[j])
//                 {
//                     count++;
//                 }
//                 else
//                 {
//                     break;
//                 }
//                 j--;
//             }
//             output.add(count);
            
            
//         }
//         return output;
//     }
// }
// tc is o(no of days )
// s.c is o(total no of calls)

// optimal solution

class Solution {

    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            int span = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            output.add(span);
            stack.push(i);
        }
        return output;
    }
}


// tc is o(2n)
// s.c is o(n)