package Stacks;
import java.util.Stack;
// brute force 

// class MinStack {
//     int[] st;
//     int top;
//     int minValue;
//     public MinStack() {
//         top = -1;
//         st = new int[1000];
//         minValue = Integer.MAX_VALUE;

//     }
    
//     public void push(int val) {
//         if (top == st.length - 1) {
//             System.out.println("Stack overflow");
//             return;
//         }
//          top = top + 1;
//          st[top] = val;
//          if (val < minValue) {
//             minValue = val;
//         }
//     }
    
//     public void pop() {
//          if (top == -1) {
//             System.out.println("Stack underflow");
//             return;
//         }
//         if (st[top] == minValue) {
//             // Recalculate minValue
//             minValue = Integer.MAX_VALUE;
//             for (int i = 0; i < top; i++) {
//                 if (st[i] < minValue) {
//                     minValue = st[i];
//                 }
//             }
//         }
//         top = top - 1;
//     }
    
//     public int top() {
//          if (top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//        return st[top]; 
//     }
    
//     public int getMin() {
//           if (top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//        return minValue;
//     }
// }

//time complexity is O(1) and space complexity is O( 2* N)

// optimal solution 


class MinStack {
     Stack<Long> st;
    public long minValue;
    public MinStack() {
        st = new Stack<>();
        minValue = Integer.MAX_VALUE;

    }
    
    public void push(long val) {
        if(st.empty())
        {
           minValue = val;
           st.push(val);
        }
        else
        {
            if(val >= minValue)
            {
                st.push(val);

            }
            else
            {
                st.push(2*val - minValue);
                minValue = val;
            }
        }
         
    }
    
    public void pop() {
        if(st.empty())
        {
           return;
        }
        long topValue = st.pop();
        if(topValue < minValue)
        {
            minValue = 2 * minValue - topValue;

        }
    }
    
    public long top() {
        if(st.empty())
        {
           return -1;
        } 
        long topValue = st.peek();
        if(topValue >= minValue)
        {
            return topValue;
        }

       return minValue; 
    }
    
    public long getMin() {
       
       return minValue;
    }
}


//time complexity is O(1) and space complexity is O( N)