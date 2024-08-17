package Sorting;

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       if(i == 1)
       {
           return;
       }
       insert(arr, i - 1);
       
       int temp = arr[i - 1];
        
        int j = i - 2;
        
        // The issue causing the ArrayIndexOutOfBoundsException occurs because you are 
        // accessing an invalid array index (j = -1) inside the while loop condition. 
        // This happens because you're checking arr[j] > temp before checking if j is
        // valid (j >= 0). 
        // When j becomes -1, you attempt to access arr[-1], which causes the error.
        // while( arr[j] > temp && j >= 0 )
        // {
        //     arr[j + 1] = arr[j];
        //     j--;
        // }
          while( j >= 0 && arr[j] > temp  )
         {
             arr[j + 1] = arr[j];
             j--;
         }
       
       arr[j + 1] = temp;
      
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      
      if(n == 0)
      {
          return;
      }
      insert(arr, n);
  }
}


// class Solution
// {
//   static void insert(int arr[],int i)
//   {
//          Your code here
//        for( int j = i; j < arr.length; j++)
//        {
//            int temp = arr[j];
//            int k = j - 1;
//            for(; k >=0; k--)
//            {
//                if(temp < arr[k])
//                {
//                    arr[k + 1] = arr[k];
//                }
//                else
//                {
//                    break;
//                }
//            }
//            arr[k + 1] = temp; 
//        }
//   }
//   Function to sort the array using insertion sort algorithm.
//   public void insertionSort(int arr[], int n)
//   {
//       code here
      
//       int i = 1;
      
//       insert(arr, i);
//   }
// }