class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while( i< m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                output[k++] = nums1[i++];
            }
            else
            {
                output[k++] = nums2[j++];
            }
        }
        while(i < m)
        {
            output[k++] = nums1[i++];
        }
         while(j < n)
        {
            output[k++] = nums2[j++];
        }
        
        for(i = 0; i <  m +n; i++)
        {
            nums1[i] = output[i];
        }
     
    }
 
}
