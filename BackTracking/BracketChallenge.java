package BackTracking;

import java.util.*;

public class Solution {

    static Set<String> ans = new HashSet<>();
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of parentheses
        int m = sc.nextInt(); // number of braces

        rec(n, n, m, m, "");
        
        List<String> output = new ArrayList<>(ans);
        Collections.sort(output); // Optional: sort for consistent output
        for (String s : output) {
            System.out.println(s);
        }
    }

    static void rec(int openP, int closeP, int openB, int closeB, String s) {
        if (openP == 0 && closeP == 0 && openB == 0 && closeB == 0) {
            ans.add(s);
            return;
        }

        // Add opening parenthesis
        if (openP > 0) {
            stack.push('(');
            rec(openP - 1, closeP, openB, closeB, s + "(");
            stack.pop();
        }

        // Add closing parenthesis only if top of stack is '('
        if (closeP > openP && !stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
            rec(openP, closeP - 1, openB, closeB, s + ")");
            stack.push('('); // backtrack
        }

        // Add opening brace
        if (openB > 0) {
            stack.push('{');
            rec(openP, closeP, openB - 1, closeB, s + "{");
            stack.pop();
        }

        // Add closing brace only if top of stack is '{'
        if (closeB > openB && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
            rec(openP, closeP, openB, closeB - 1, s + "}");
            stack.push('{'); // backtrack
        }
    }
}

