package Sorting;



class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        
        if( low >= high)
        {
            return;
        }
        
        int p = partition(arr, low, high);
        
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1 , high);
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        
        int pivot = arr[low];
        int pivotIndex = 0;
        
        int count  = 0;
        
        for(int i = low  + 1; i <= high; i++)
        {
            if(arr[i] <= pivot)
            {
                count++;
            }
        }
        
        pivotIndex = low + count;
        
        
        int temp = arr[low];
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        
     
       
    int i = low;
    
    int k = high;
    
    temp = 0;
    while(i < pivotIndex && k > pivotIndex)
    {
        if(arr[i] < pivot )
        {
            i++;
        }
        else if (arr[k] > pivot)
        {
            k--;
        }
        else if(arr[i] > pivot && arr[k] < pivot )
        {
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
       
        
    }
        
    return pivotIndex;
    } 
}