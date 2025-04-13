package Arrays;

// brute force
// class Solution {
//     public void rotate(int[] nums, int k) {
        

//         int[] temp = new int[k];
//         int n = nums.length;
//               k = k % n;     
//             for(int i = 0; i < k ; i++)
//             {
//                 temp[i] = nums[n -k +i];
//             }
//             for(int j = n-1; j>=k; j--)
//             {
//             nums[j] = nums[j-k];
//             }
            
//             for(int i = 0; i<k;i++)
//             {
//                 nums[i] = temp[i];
//             }
      
          


//     }
// }

// optimal

class Solution {
    public void reverse(int[]nums, int start, int end )
    {


        while(start <= end)
        {        
            int temp =nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1 );
        reverse(nums, 0, n-1);
    }
}