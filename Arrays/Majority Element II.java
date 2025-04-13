package Arrays;
// brute force
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
        
//         List<Integer> ls = new ArrayList<Integer>();
//         int n = nums.length;
        
//         for(int i = 0; i < n; i++)
//         {
//             if(ls.contains(nums[i])) continue;
//             int count = 0;
//             for(int j = 0; j < n; j++)
//             {
//                 if(nums[j] == nums[i])
//                 {
//                     count++;
//                 }

//             }
//             if(count > n / 3) 
//             {
//                 ls.add(nums[i]);
//             }
//             if(ls.size() == 2)
//             {
//                 break;
//             }  
//         }
//         return ls;
//     }
// }

// better approach

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
        
//         List<Integer>ls = new ArrayList<Integer>();
//         HashMap<Integer, Integer> mpp = new HashMap<>();
//         int n = nums.length;
//         int min =n/3 + 1;
//         for(int i = 0; i < n; i++)
//         {
//             int value = mpp.getOrDefault(nums[i], 0);
//             mpp.put(nums[i], value + 1);
//             if(mpp.get(nums[i]) == min)
//             {
//                 ls.add(nums[i]);
//             }

//         }
//         return ls;
//     }
// }

// better approach 2
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
        
//         List<Integer>ls = new ArrayList<Integer>();
//         HashMap<Integer, Integer> mpp = new HashMap<>();
//         int n = nums.length;
//         int min =n/3 + 1;
//         for(int i = 0; i < n; i++)
//         {
//             int value = mpp.getOrDefault(nums[i], 0);
//             mpp.put(nums[i], value + 1);
//             if(mpp.get(nums[i]) == min)
//             {
//                 ls.add(nums[i]);
//             }
//             if (ls.size()== 2)
//             {
//                 break;
//             }

//         }
//         return ls;
//     }
// }

// optimal approach

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>ls = new ArrayList<Integer>();
        int n = nums.length;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++)
        {
            if(count1 == 0 && nums[i] != el2)
            {
               count1 = 1;
               el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1)
            {
               count2 = 1;
               el2 = nums[i];
            }
            else if(nums[i] == el1)
            {
               count1++;
               
            }
             else if(nums[i] == el2)
            {
               count2++;
               
            }
            else
            {
               count1--;
               count2--; 
            }
 
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] == el1)
            {
                count1++;
            }
            if(nums[i] == el2)
            {
                count2++;
            }
           
        }
         int mini = n /3 + 1;
            if(count1 >= mini )
            {
                ls.add(el1);
            }
            if(count2 >= mini)
            {
                ls.add(el2);
            }

        return ls;
    }
}