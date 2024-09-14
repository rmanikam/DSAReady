package BinarySearch;

class Solution {

    public int findMaxIndex(int[][] mat, int m, int n, int col)
    {
        int max = -1;
        int maxIndex = -1;
        for(int i = 0; i < m; i++ )
        {
            if(max < mat[i][col] )
            {
                max = mat[i][col];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public int[] findPeakGrid(int[][] mat) {
        
      int m = mat.length;
      int n = mat[0].length;
      int low = 0;
      int high = n - 1;
      while(low <= high)
      {
        int mid = low + (high - low) / 2;

        int maxRowIndex = findMaxIndex(mat, m, n, mid);

        int left = mid - 1 >= 0 ? mat[maxRowIndex][mid-1] : -1;

        int right = mid + 1 < n ? mat[maxRowIndex][mid+1] : -1 ;

        if( mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right)
        {

            return new int[]{maxRowIndex, mid};
        }
        else if(mat[maxRowIndex][mid] < left)
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
      }
      return new int[]{-1, -1};

    }
}

