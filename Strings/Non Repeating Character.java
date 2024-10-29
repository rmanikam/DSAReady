package Strings;


class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        
        char[] arr = s.trim().toCharArray(); // convert string to character array using charArray
         int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int count = 1;
            for(int j = 0 ; j < n; j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    count++;
                    break;
                }
            }
            if(count == 1)
            {
                return arr[i];
            }
           
        }
        return '$';
        
    }
}
