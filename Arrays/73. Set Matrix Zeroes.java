package Arrays;

class Solution {

    // Brute Force
    // public void markRow(int[][] matrix, int i, int n)
    // {
    //     for(int j = 0; j < n; j++)
    //     {
    //         if(matrix[i][j] != 0)
    //         {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public void markColumn(int[][] matrix, int j, int m)
    // {
    //     for(int i = 0; i < m; i++)
    //     {
    //         if(matrix[i][j] != 0)
    //         {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length;
        // for(int i = 0; i < m; i++)
        // {
            
        //     for(int j = 0; j < n; j++)
        //     {
        //         markRow(matrix,i,n);
        //         markColumn(matrix,j,m);
        //     }
        // }
        // for(int i = 0; i < m; i++)
        // {
            
        //     for(int j = 0; j < n; j++)
        //     {
        //         if(matrix[i][j] == -1)
        //         {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
    // }

    // better solution
    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //      int[] row = new int[m];
    //      int[] col = new int[n];
    //     for(int i = 0; i < m; i++)
    //     {
    //        for(int j = 0; j < n; j++)
    //        {
    //            if(matrix[i][j] == 0 )
    //            {
    //                row [i] = 1;
    //                col [j] = 1;
    //            }
    //        }
    //     }
   
    //      for(int i = 0; i < m; i++)
    //     {
    //        for(int j = 0; j < n; j++)
    //        {
    //            if(row[i] == 1 || col[j] == 1 )
    //            {
    //                matrix[i][j] = 0;
    //            }
    //        }
    //     }
   
          
    //    }

       // time complexity for better solution is O(2*n*m) 
       // and space complexity for better solution is O(n) + O(m)
     // better solution

       // col[0] => row[n] => matrix[..][0]
       // row[0] => col[m] => matrix[0][..]
   
   
       public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int colZero = 1;
       for(int i = 0; i < m; i++)
       {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;

                    if(j != 0)
                    {
                        matrix[0][j] = 0;
                    }
                    else{
                        colZero = 0;
                    }
                    
                }
            }
       }

       for(int i = 1; i < m; i++)
       {
          for(int j = 1; j < n; j++)
          {
             if(matrix[i][j] != 0)
             {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
             }
          }
       }

       if(matrix[0][0] == 0)
       {
            for(int j =0; j < n; j++)
            {
                matrix[0][j] = 0;
            }
       }
      if(colZero == 0)
      {
        for(int i = 0; i < m; i++)
        {
            matrix[i][0] = 0;
        }
      }
    

    }

}