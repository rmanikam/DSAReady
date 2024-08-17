package Sorting;



class Solution
{
    void merge(int arr[], int l, int m, int r)
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
           if(output1[index1] < output2[index2])
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
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        
         if(l >= r)
        {
            return;
        }
        
        int mid  = (l + r) / 2;
        
        // call recursion on left part
        
         mergeSort(arr, l, mid);
         
         // call recursion on right part
         
         mergeSort(arr, mid + 1, r);
         
         merge(arr, l, mid, r);
    }
}

