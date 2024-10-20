package Stacks;

import java.util.Stack;


class Solution {
    public static int priority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1; // This is a default return value for unknown operators.
    }

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        
        int i = 0; 
        Stack<String> stack = new Stack<String>();
        String ans ="";
        
        int n = exp.length();
        while(i < n)
        {
            if((exp.charAt(i) >= 'A' &&  exp.charAt(i) <= 'Z') ||
            (exp.charAt(i) >= 'a' &&  exp.charAt(i) <= 'z') ||
            (exp.charAt(i) >= '0' &&  exp.charAt(i) <= '9'))
            {
                ans = ans + exp.charAt(i);
            }
            else if(exp.charAt(i) == '(')
            {
                stack.push(Character.toString(exp.charAt(i)));
            }
            else if(exp.charAt(i) == ')')
            {
                while(!stack.empty() && !stack.peek().equals("("))
                {
                    ans += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.empty() && priority(exp.charAt(i)) <= priority(stack.peek().charAt(0)))
                {
                   ans += stack.peek();
                   stack.pop();
                }
                stack.push(Character.toString(exp.charAt(i)));
            }
            i++;
        }
        while(!stack.empty())
        {
            ans = ans + stack.peek();
            stack.pop();
        }
        return ans;
    }
}