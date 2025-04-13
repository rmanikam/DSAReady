package Arrays;

// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//      int[] output = new int[n];
//      int posIndex = 0, negIndex = 1;
//      for(int i = 0; i < n; i++)
//      {
//         if(nums[i] < 0)
//         {
//            output[negIndex] = nums[i];
//            negIndex = negIndex + 2;
//         }
//         else
//         {
//            output[posIndex] = nums[i];
//            posIndex = posIndex + 2;
//         }
//      }
//      return output;

//     }
// }



class Solution {

   // temp: input array
   // n: size of array
   // Function to rearrange  the array elements alternately.
   public static void rearrange(int arr[]) {

       // Your code here
       
       // optimal
       
        Arrays.sort(arr);
       int n = arr.length;
       int mn = 0;
       int mx = n - 1;
       int p = arr[n-1] + 1;
       
       for(int i = 0; i < n; i++)
       {
           int a = arr[i];
           if(i%2 == 0)
           {
                int b = arr[mx]%p;
                mx--;
                arr[i] = a + b * p;
           }
           else
           {
               int b = arr[mn]%p;
               mn++;
               arr[i] = a + b * p;
           }
       }
       for(int i = 0; i < n; i++)
       {
           arr[i]/= p; 
       }
      
     
   }
}