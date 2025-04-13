package Strings;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Splits by one or more spaces
        
        // Step 2: Reverse the array of words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" "); // Add space between words
            }
        }
        
        // Step 3: Return the result as a string
        return result.toString();
    }
}