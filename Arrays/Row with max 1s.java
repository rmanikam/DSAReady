package Arrays;

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int rowIndex = -1;
        int max = 0;
        int m = arr.length;
        int n = arr[0].length;
        
        for(int i = 0; i < m; i++)
        {
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
            }
            if(max < count)
            {
                max = count;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}
