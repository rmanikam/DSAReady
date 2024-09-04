package Arrays;

class Solution {

    // Brute Force
    // public int reversePairs(int[] nums) {

    //     int n = nums.length;
    //     int count  = 0;
    //     for(int i = 0 ; i < n-1; i++)
    //     {
    //         for(int j = i + 1; j < n; j++)
    //         {
    //             if(nums[i] > 2 * nums[j])
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }


    public void merge(int arr[], int l, int m, int r)
    {
         // Your code here

 
        int length1 = m - l + 1;
        int length2 =  r - m;
        int output1[] = new int[length1];
        int output2[] = new int[length2];
        
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
           else
           {
               arr[index++] = output2[index2++];
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
       
    }

    public int countPairs(int arr[], int low, int mid, int end)
    {
        int count = 0;
         int right = mid + 1;
        
        //  2L: By using 2L, you're explicitly using a long type for the multiplication, 
        // which avoids the overflow issue since long can handle much larger values than int.
          for(int i = low; i <= mid; i++)
          {
               while(right <= end && arr[i] > 2L * arr[right])
               {
                right++;
               }
               count += right - (mid + 1);
          }

        return count;
    }
    public int mergeSort(int arr[], int l, int r)
    {
        //code here
        int count  = 0;
         if(l >= r)
        {
            return count;
        }
        
        int mid  = (l + r) / 2;
        
        // call recursion on left part
        
         count += mergeSort(arr, l, mid);
         
         // call recursion on right part
         
         count += mergeSort(arr, mid + 1, r);
         
         count += countPairs(arr, l, mid, r);

         merge(arr, l, mid, r);
         return count;
    }


  
        public int reversePairs(int[] nums) {
            // Your Code Here
            int n = nums.length;
            return mergeSort(nums, 0, n-1);
            
            
        }
    }


    // time complexity is  O(2nlogn)
    // space complexity is O(n)
