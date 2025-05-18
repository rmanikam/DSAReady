package SlidingWindow;

class Solution {
    int countSubstr(String s, int k) {
      int l = 0, r = 0;
      Map<Character, Integer> mpp = new HashMap<Character, Integer>();
      int n = s.length();
      int count  = 0;
      while(r< n)
      {
          char ch = s.charAt(r);
          mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
          if(mpp.size() > k)
          {
              char leftChar = s.charAt(l);
              mpp.put(leftChar, mpp.getOrDefault(leftChar, 0) - 1);
              if(mpp.get(leftChar) == 0)
              {
                  mpp.remove(leftChar);
              }
              l++;
          }
          if (mpp.size() == k) {
                count += (r - l + 1);
            }
       
           r++;
           
      }
      return count;
      
        
    }
}
