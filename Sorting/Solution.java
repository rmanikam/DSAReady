package Sorting;


// class Solution
// {
    
// 	int select(int arr[], int i)
// 	{
//   code here such that selectionSort() sorts arr[]
//           int n = arr.length;
//           int minIndex = 0;
//         for(int j = i; j < n - 1; j++)
//         {
//             minIndex = j;
//             int k = 0;
//             for( k = j + 1; k < n; k++)
//             {
//                 if(arr[k] < arr[minIndex])
//                 {
//                     minIndex = k; 
//                 }
//             }
          
//             int temp = arr[j];
//             arr[j] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//         return minIndex;
// 	}
	
// 	void selectionSort(int arr[], int n)
// 	{
//            code here
// 	         int i = 0;
//              int y = select(arr, i);
           
// 	}
// }
// in selection sort we find the min element  and put it in index ith position
 class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
 
        int index = 0;
        int n = arr.length;
        for(int i = 0; i <= n - 1; i++)
        {
            int x = Integer.MAX_VALUE;
            for(int j = i; j <  n; j++)
            {
                if(x > arr[j])
                {
                    x = arr[j];
                    index = j;
                }
            }

                   int temp = arr[i];
             arr[i] = x;
             arr[index] = temp;
            

        }
    }
}