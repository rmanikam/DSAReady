package Arrays;

// brute force

// class Solution {
//     public void rotate(int[][] matrix) {
        
//         int m = matrix.length;
//         int n = matrix[0].length;
     

//         int[][] ans = new int[m][n];
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 ans[j][n-1-i] = matrix[i][j];
              
//             }
//         }
//          for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 matrix[i][j] = ans[i][j];
              
//             }
//         }
        // time complexity is o(n^2)
        // space complexity is O(n^2)
//     }
// }

class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;

      
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
     
    //    int  i = 0;
    //    int j = n-1;
    //    while( i < n)
    //    {
    //     while(j >= 0)
    //     {
    //         int temp = matrix[i][j];
    //         matrix[i][j] = matrix[i][n-j-1];
    //         matrix[i][n-j-1] = temp;
    //         j--;
    //     }
    //     i++;
    //    }

    for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - j - 1];
                matrix[i][m - j - 1] = temp;
            }
        }
   
    }
}

// time complexity is O(N * N )  + O(N * N/2) = O(N^2)
// space complexity is O(1)