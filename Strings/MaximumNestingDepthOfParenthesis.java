package Strings;

// sol 1
// class Solution {
//     public int maxDepth(String s) {
//         int max = 0;
//         int current = 0;

//         for(char ch:s.toCharArray())
//         {
//             if(ch == '(')
//             {
//                 current++;
                
//             }
//             else if(ch == ')')
//             {
//                 current--;
//             }
//             if(max < current)
//             {
//                 max = current;
//             }
//         }
//         return max;
       
//     }
// }

// sol2

// class Solution {
//     public int maxDepth(String s) {
//         int max = 0;
//         int count = 0;
//         for(int i = 0; i < s.length(); i++)
//         {
//             if(s.charAt(i) == '(')
//             {
//                 count++;
//             }
//             else if(s.charAt(i) == ')')
//             {
//                 count--;
//             }
//             if(max < count)
//             {
//                 max = count;
//             }
//         }
//         return max;
//     }
// }

// sol3

class Solution {
    public int maxDepth(String s) {

        int count = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < s.length())
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            else if(s.charAt(i) == ')')
            {
                count--;
            }
            max = Math.max(max, count);
            i++;
        }
        return max;

        
    }
}
