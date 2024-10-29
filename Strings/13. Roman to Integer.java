package Strings;


class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        for(int i = 0; i<n ; i++)
        {
            if(i < n-1)
            {
                if(s.charAt(i) == 'I' &&  s.charAt(i+1) == 'V' )
                {
                    sum+=4;
                    i++;
                    continue;
                }
                else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X' )
                {
                    sum+=9;
                    i++;
                    continue;
                }
                else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L' )
                {
                    sum+=40;
                    i++;
                    continue;
                }
                else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C' )
                {
                    sum+=90;
                    i++;
                    continue;
                }
                else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D' )
                {
                    sum+=400;
                    i++;
                    continue;
                }
                else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M' )
                {
                    sum+=900;
                    i++;
                    continue;
                }
            }
            if(s.charAt(i) == 'I')
                sum += 1;
            if(s.charAt(i)== 'V' )
            {
                sum+=5;
            }
             if(s.charAt(i) == 'X')
                sum += 10;
             if(s.charAt(i) == 'L')
                sum += 50;
             if(s.charAt(i) == 'C')
                sum += 100;
             if(s.charAt(i) == 'D')
                sum += 500;
             if(s.charAt(i) == 'M')
                sum += 1000;
        }
        return sum;
    }
}