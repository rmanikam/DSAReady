package Sorting;

// Increasing - 1 2 3 4

// Nondecreasing - 1 1 2 3

// The difference being that in an increasing sequence, for x(n) 
// and x(n+1), x(n+1) > x(n) whereas in a non-decreasing sequence, x(n+1) >= x(n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
      int[] output1 = new int [m + n];
      
      int i = 0;
      int j = 0;
      int k = 0;
      while( i < m && j < n)
      {
        if(nums1 [i] < nums2[j])
        {
            output1[k++] = nums1[i++];
        }
        else
        {
            output1[k++] = nums2[j++];
        }
      }
      while( i < m )
      {
        output1[k++] = nums1[i++];
      }
      while(  j < n)
      {
        
        output1[k++] = nums2[j++];
        
      }
      
      for(i = 0; i < m + n; i++)
      {
        nums1[i] = output1[i];
      }
    }


    
}