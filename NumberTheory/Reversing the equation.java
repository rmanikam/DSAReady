package NumberTheory;



//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
             StringBuilder res= new StringBuilder();
             StringBuilder temp= new StringBuilder();
            for(int i = 0; i < S.length(); i++)
            {
                if(S.charAt(i) >='0' && S.charAt(i) <= '9')
                {
                    temp.append( S.charAt(i)); 
                }
                else
                {
                    res.insert(0, temp);
                    res.insert(0, S.charAt(i));
                    temp.setLength(0);
                }
            }
            if(temp.length() != 0)
            {
              res.insert(0, temp);
            } 
            
            return res.toString();
    }
}