package Arrays;

//brute force

// class Solution {
//     // arr[]: Input Array
//     // N : Size of the Array arr[]
//     // Function to count inversions in the array.
//     static long inversionCount(long arr[], int n) {
//         // Your Code Here
        
//         int count  = 0;
//         for(int i = 0; i < n - 1; i++)
//         {
//             for(int j = i + 1; j < n; j++)
//             {
//                 if(arr[i] > arr[j] && i < j)
//                 {
//                     count++;
//                 }
//             }
        
//         }
//         return count;
        
//     }
// }


class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long merge(long arr[], int l, int m, int r)
    {
         // Your code here

         long count  = 0;
        int length1 = m - l + 1;
        int length2 =  r - m;
        long output1[] = new long[length1];
        long output2[] = new long[length2];
        
        int index = l;
       for(int i = 0; i < length1; i++)
       {
           output1[i] = arr[index++];
           
       }
       for(int i = 0; i < length2; i++)
       {
           output2[i] = arr[index++];
           
       }
       
       int index1 = 0;
       int index2 = 0;
       
       index = l;
       while(index1 < length1 && index2 < length2)
       {
           if(output1[index1] <= output2[index2])
           {
               arr[index++] = output1[index1++];
               
           }
           // right is smaller
           else
           {
               arr[index++] = output2[index2++];
               count += (length1 - index1);
           }
       }
       while(index1 < length1)
       {
           
            arr[index++] = output1[index1++];
         
       }
       while(index2 < length2)
       {
           
            arr[index++] = output2[index2++];
         
       }
       return count;
    }
    static long mergeSort(long arr[], int l, int r)
    {
        //code here
        long count  = 0;
         if(l >= r)
        {
            return count;
        }
        
        int mid  = (l + r) / 2;
        
        // call recursion on left part
        
         count += mergeSort(arr, l, mid);
         
         // call recursion on right part
         
         count += mergeSort(arr, mid + 1, r);
         
         count += merge(arr, l, mid, r);
         return count;
    }


  
        static long inversionCount(long arr[], int n) {
            // Your Code Here
            
            return mergeSort(arr, 0, n-1);
            
            
        }
    }

// time complexity is O(nlogn);
// space complexity is O(n);

// do dry run of this code