package Strings;

class Solution {
   //  public boolean isAnagram(String s, String t) {
     

   //   int m = s.length();
   //   int n = t.length();

   //  int[] count = new int [26];
    
   //   if(m != n)
   //   {
   //      return false;
   //   }
   //   else
   //   {
   //       for(int i = 0; i < m; i++)
   //       {
   //          count[s.charAt(i) - 'a']++;
   //       }
   //       for(int i = 0; i < n; i++)
   //       {
   //          count[t.charAt(i) - 'a']--;
   //       }
   //       for(int i = 0; i < count.length; i++)
   //       {
   //          if(count[i] != 0)
   //          {
   //             return false;
   //          }
   //       }
   //   }
   //   return true;

   //  }

   public boolean isAnagram(String s, String t) {
    
   if(s.length() != t.length())
   {
       return false;
   }
   int[] counts = new int[26];
    
   for(int i = 0; i < s.length(); i++)
   {
       counts[s.charAt(i) - 'a']++;
       counts[t.charAt(i) - 'a']--;
   }

   for(int count:counts)
   {
       if(count != 0)
       {
           return false;
       }
   }  
   return true;
}
}


