package Arrays;

// approach1
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {

//         int n = nums.length;
//         Arrays.sort(nums);
//         List<Integer> res = new ArrayList<Integer>();
//         for(int i = 0; i < n - 1; i++)
//         {
//             if(nums[i] == nums[i+1])
//             {
//                 res.add(nums[i]);
//             }

        
//         }
//         return res;
        
//     }
// }

// optimal
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        for(int num: nums)
        {
            nums[Math.abs(num) - 1] *= -1;
        }
        for(int num: nums)
        {
            if(nums[Math.abs(num) - 1] > 0)
            {
              res.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }
        
        return res;
        
    }
}