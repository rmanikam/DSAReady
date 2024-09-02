package Arrays;

// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int maxProduct = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(n == 1 && nums[i] < 0)
//             {
//                 return nums[i];
//             }
//             int prod = 1;
//             for(int j = i; j < n; j++)
//             {
                
//                 prod = prod * nums[j];
//                 maxProduct = Math.max(maxProduct, prod);
//             }
             
//         }
//         return maxProduct;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(prefix == 0)
            {
                prefix = 1;
            }
            if(suffix == 0)
            {
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));     
        }
        return maxProduct;
    }
}
