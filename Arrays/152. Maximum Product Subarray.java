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

// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int prefix = 1;
//         int suffix = 1;
//         int maxProduct = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++)
//         {
//             if(prefix == 0)
//             {
//                 prefix = 1;
//             }
//             if(suffix == 0)
//             {
//                 suffix = 1;
//             }
//             prefix = prefix * nums[i];
//             suffix = suffix * nums[n-i-1];
//             maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));     
//         }
//         return maxProduct;
//     }
// }

// brute force

// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxi = Integer.MIN_VALUE;
//         int n = nums.length;
        
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i ; j < n; j++)
//             {
//                 int prod= 1;
//                 for(int k = i; k <= j; k++)
//                 {
//                      prod = prod * nums[k];
                     
//                 }
//                 maxi = Math.max(maxi, prod);
               
//             }
//         }
//         return maxi;
//     }
// }

// better approach

// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxi = Integer.MIN_VALUE;
//         int n = nums.length;
        
//         for(int i = 0; i < n; i++)
//         {
//             int prod= 1;
//             for(int j = i ; j < n; j++)
//             {
//                 prod = prod * nums[j];
//                 maxi = Math.max(maxi, prod);   
//             }

//         }
//         return maxi;
//     }
// }

// optimal approach

class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int suff = 1;
        int pre = 1;
        for(int i = 0; i < n; i++)
        {
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre =  pre * nums[i];
            suff = suff * nums[n-i-1];
            maxi = Math.max(maxi, Math.max(pre, suff));   
            

        }
        return maxi;
    }
}