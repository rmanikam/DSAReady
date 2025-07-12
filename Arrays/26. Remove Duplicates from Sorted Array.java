package Arrays;
// class Solution {

//     public int removeDuplicates(int[] nums) {

//         int l = 1;

//         for(int r=1; r < nums.length; r++)
//         {
//             if(nums[r-1] != nums[r])
//             {
//                 nums[l] = nums[r];
//                 l++;

//             }
//         }
//         return l;

//     }
// }

// package Arrays;
// brute force
// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int k = 0;
//         for(int i = 0; i < nums.length; i++)
//         {

//             boolean flag = false;

//             for(int j = 0; j < k;j++)
//             {
//               if(nums[i] == nums[j])
//               {
//                 flag = true;
//                 break;
//               }  
//             }
//             if(!flag)
//             {

//                 nums[k] = nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
// }

class Solution {
  public int removeDuplicates(int[] nums) {

    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[j]) {
        j++;
        nums[j] = nums[i];

      }
    }

    return j + 1;
  }
}