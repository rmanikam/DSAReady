package Arrays;

import java.util.Arrays;

class Solution {
    
    
    String calculateSum(String s1, String s2)
    {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        String sum = "";
        while(i >=0 && j >= 0)
        {
            int d1 = s1.charAt(i) -'0';
            int d2 = s2.charAt(j) - '0';
            int currentSum = d1 + d2 + carry;
            sum = Integer.toString(currentSum %10) + sum;
            carry = currentSum / 10;
            i--;
            j--;
        }
        while(i >=0 )
        {
            int d1 = s1.charAt(i) -'0';
            int currentSumOne = d1 + carry;
            sum = Integer.toString(currentSumOne %10) + sum;
            carry =currentSumOne / 10;
            i--;
        }
        while(j >=0 )
        {
            int d2 = s2.charAt(j) -'0';
            int currentSumTwo = d2 + carry;
            sum = Integer.toString(currentSumTwo %10) + sum;
            carry = currentSumTwo / 10;
            j--;
        }
        if(carry != 0)
        {
            sum =  Integer.toString(carry) + sum;
        }
        int k = 0;
    for( k = 0; k < sum.length(); )
        {
            if(sum.charAt(k) == '0')
            {
               k++;
            }
            else
            {
                break;
            }
           
            
           
        }
          return k == sum.length() ? "0" : sum.substring(k);
    

        
    }
    String solve(int[] arr, int n) {
        // code here
        String a = "";
        String b = "";
        int sum = 0;
        
        Arrays.sort(arr);
      
            for(int i =0; i <n; i++)
            {
               if(i%2 == 0)
               {
                   a  = a + Integer.toString(arr[i]);
               }
               else
               {
                  b  = b + Integer.toString(arr[i]); 
               }
           
            }
    
            
        return calculateSum(a, b);
    }

}