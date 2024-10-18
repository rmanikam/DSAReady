package Stacks;

import java.util.Stack;

class Solution {
  
    public boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char ch : s.toCharArray()) {
            // If we encounter an opening bracket, push it to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // If we encounter a closing bracket, check for a matching opening bracket
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();

                // Check if the popped element matches the closing bracket
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; // Mismatched parenthesis
                }
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}


















