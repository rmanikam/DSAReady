package Arrays;


class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n = arr1.length;
        int m = arr2.length;
        
        int arr3[] = new int [m+n];
        int i = 0, j = 0, r = 0;
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[r] = arr1[i];
                i++;
                r++;
            }
            else
            {
                arr3[r] = arr2[j];
                j++;
                r++;
            }
        }
        while(i < n)
        {
           arr3[r] = arr1[i];
            i++;
            r++;
            
        }
        while(j < m)
        {
           arr3[r] = arr2[j];
            j++;
            r++;
            
        }
        return arr3[k - 1];
    }
}