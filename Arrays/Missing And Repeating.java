package Arrays;


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
     int missingNo = -1, repeatingNo = -1;
       int[] result = new int[2];
     for(int i = 1; i <= n; i++)
     {
         int count = 0;
         for(int j = 0; j < n; j++)
         {
             if(arr[j] == i)
             {
                 count++;
             }
         }
         if(count == 0)
         {
            missingNo = i;
         }
         if(count == 2)
         {
             repeatingNo = i;
         }
         if(missingNo != -1 && repeatingNo != -1)
         {
             result[0] = repeatingNo;
             result[1] = missingNo;
             break;
         }
     }
    
     
    
     return result;
    }
}