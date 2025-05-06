public class Remove Element {
    int k = nums.length - 1;
       for(int i = 0; i <= k;)
       {
            if(val == nums[i])
            { 
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k--;
            }
            else
            {
                i++;
            }
       
       }
      
       
       return k + 1;
}
