package Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int count =0;
       int count1 = 0;
       int count2 =0;
       int i = 0; 
       int j = 0;
       int k = 0;
       while(i <nums.length)
       {
        if(nums[i] == 0)
        {
            count++;
        }
        else if(nums[i] == 1)
        {
            count1++;
        }
        else
        {
            count2++;
        }
        i++;
       }
       i = 0;
       while(i < count)
       {
        nums[i] = 0;
        i++;
       }
     
         while(i < count + count1)
       {
        nums[i] = 1;
        i++;
       }
       
       while(i < count + count1 + count2)
       {
        nums[i] = 2;
        i++;
       }
    }
}
