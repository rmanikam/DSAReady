package Strings;



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] words = str.trim().split("\\.");
        int n = words.length;
        int i = 0;
        // System.out.print(Arrays.toString(words));
        while(i < n/2)
        {
            String temp = words[i];
            words[i] = words[n-i-1];
            words[n-i-1] = temp;
            i++;
        }
        String result = String.join(".",words);
        return result;
    }
}


