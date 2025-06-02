package Queue;

// approach1

// class MyQueue {
//      Stack<Integer> s1 = new Stack<Integer>();
//       Stack<Integer> s2 = new Stack<Integer>();
//     public MyQueue() {

//     }

//     public void push(int x) {
//         while(!s1.isEmpty() )
//         {
//             s2.push(s1.peek());
//             s1.pop();

//         }
//         s1.push(x);

//         while(!s2.isEmpty())
//         {
//             s1.push(s2.peek());
//             s2.pop();
//         }

//     }

//     public int pop() {
//         if(!s1.isEmpty())
//         {
//             return s1.pop();
//         }
//         return -1;
//     }

//     public int peek() {
//         if(!s1.isEmpty())
//         {
//             return s1.peek();
//         }
//         return -1;
//     }

//     public boolean empty() {
//         if(s1.isEmpty())
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
// }

//approach2

class MyQueue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    public MyQueue() {

    }

    public void push(int x) {

        input.push(x);
    }

    public int pop() {
        if (!output.isEmpty()) {
            return output.pop();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
            if (!output.isEmpty()) {
                return output.pop();
            }

        }
        return -1;
    }

    public int peek() {
        if (!output.isEmpty()) {
            return output.peek();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }

            if (!output.isEmpty()) {
                return output.peek();
            }

        }
        return -1;

    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
