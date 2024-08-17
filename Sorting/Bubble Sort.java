package Sorting;

//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        
        for(int i = 0; i < n-1; i++)
        {
            int temp = 0;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
