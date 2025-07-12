package Stacks;

import java.util.Stack;
// import java.util.Queue;
// import java.util.LinkedList;
// iterative approach 

// class Solution
// { 
//     static void reverse(Stack<Integer> s)
//     {
//         add your code here

//         Queue<Integer> qu = new LinkedList<>();

//         while(!s.empty())
//         {
//             qu.add(s.pop());

//         }
//         while(!qu.isEmpty())
//         {
//            s.push(qu.remove());

//         }
//     }
// }

// Recursive approach

class Solution {
  static void push_back(Stack<Integer> s, int x) {
    if (s.empty()) {
      s.add(x);

    } else {
      int y = s.peek();
      s.pop();
      push_back(s, x);
      s.add(y);
    }
  }

  static void reverse(Stack<Integer> s) {
    // add your code here

    if (!s.empty()) {
      int x = s.peek();
      s.pop();
      reverse(s);
      push_back(s, x);

    }
  }

}