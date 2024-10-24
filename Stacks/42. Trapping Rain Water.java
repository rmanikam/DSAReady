package Stacks;

// brute force

// class Solution {
//     public void calPrefix(int[] prefix, int[] height)
//     {
//         int n = height.length;
//        prefix[0] = height[0];
//        for(int i = 1; i <n; i++)
//        {
//         prefix[i] = Math.max(prefix[i-1], height[i]);
//        }
//        return;
//     }
//     public void calSuffix(int[] suffix, int[] height)
//     {
//         int n = height.length;
//          suffix[n-1] = height[n-1];
//        for(int i = n-2; i >=0; i--)
//        {
//         suffix[i] = Math.max(suffix[i+1], height[i]);
//        }
//        return;
//     }
//     public int trap(int[] height) {
//         int n = height.length;
//         int[] prefixMax = new int[n];
//         int[] suffixMax = new int[n];
//         int total = 0;
//         for(int i = 0; i < n; i++)
//         {
//             calSuffix(prefixMax, height);
//             calSuffix(suffixMax, height);
//             if(height[i] < prefixMax[i] && height[i] < suffixMax[i])
//             {
//               total += Math.min(prefixMax[i], suffixMax[i]) - height[i];
//             }
//         }
//         return total;

//     }
// }

// tc is O(3N)
// sc is O(2N)

// optimal approach

// class Solution {
//     public void calSuffix(int[] suffix, int[] height)
//     {
//         int n = height.length;
//          suffix[n-1] = height[n-1];
//        for(int i = n-2; i >=0; i--)
//        {
//         suffix[i] = Math.max(suffix[i+1], height[i]);
//        }
//        return;
//     }
//     public int trap(int[] height) {
//         int n = height.length;
//         int leftMax = height[0];
//         int[] suffixMax = new int[n];
//         calSuffix(suffixMax, height);
//         int total = 0;
//         for(int i = 0; i < n; i++)
//         {
//             leftMax = Math.max(leftMax, height[i]);
            
//             if(height[i] < leftMax && height[i] < suffixMax[i])
//             {
//               total += Math.min(leftMax, suffixMax[i]) - height[i];
//             }
//         }
//         return total;

//     }
// }

// optimal solution - 2 using 2 pointer approach

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int total = 0;
        int[] trappedWater = new int[n]; // For visualization

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // update leftMax
                } else {
                    total += leftMax - height[left]; 
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // update rightMax
                } else {
                    total += rightMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}
