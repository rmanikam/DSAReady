package Stacks;

import java.util.Stack;

class Solution {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        if(s.size() == 1)
        {
            return s;
        }
        int temp = s.peek();
        s.pop();
        sort(s);
        s = insert(s, temp);
        return s;
    }
    public Stack<Integer> insert(Stack<Integer> s, int temp)
    {
        if(s.size() == 0 || s.peek() <= temp)
        {
            s.push(temp);
            return s;
        }
        int val = s.peek();
        s.pop();
        s = insert(s, temp);
        s.push(val);
        return s;
    }
}