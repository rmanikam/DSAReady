package Strings;



// class Solution {
//     Function to reverse words in a given string.
//     String reverseWords(String str) {
//         
//         String[] words = str.trim().split("\\.");
//         int n = words.length;
//         int i = 0;

//         while(i < n/2)
//         {
//             String temp = words[i];
//             words[i] = words[n-i-1];
//             words[n-i-1] = temp;
//             i++;
//         }
//         String result = String.join(".",words);
//         return result;
//     }
// }

// class Solution {
//     public String reverseWords(String s) {
        
//         StringBuilder str  = new StringBuilder();
//         String [] words = s.trim().split("\\s+");
//         for(int i = words.length - 1; i>=0 ; i--)
//         {
//             str.append(words[i]);
//             if(i != 0) str.append(" ");
//         }
//         return str.toString();
//     }
// }

