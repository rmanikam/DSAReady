package BinarySearch;

// brute force
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
        

//         for(int i = 0; i < matrix.length; i++)
//         {
//             for(int j = 0; j < matrix[0]. length ; j++)
//             {
//                 if(target == matrix[i][j])
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// better solution

// class Solution {
//     public boolean bs(int target, int[] matrix)
//     {
        
//         int start = 0;
//         int end = matrix.length - 1;
//         while(start <= end)
//         {
//             int mid = start + (end - start)/ 2;
//             if(target == matrix[mid])
//             {
//                 return true;
//             }
//             else if(target < matrix[mid])
//             {
//                 end = mid - 1;
                
//             }
//             else
//             {
//                 start = mid+1;
//             }

//         }
//         return false;
//     }
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         int m = matrix[0].length;
//         for(int i = 0; i < matrix.length; i++)
//         {
           
//                 if( matrix[i][0] <= target && target <= matrix[i][m-1]) 
//                 {
//                     if(bs(target, matrix[i]))
//                     {
//                         return true;
//                     }
//                 }
            
//         }
//         return false;
//     }
// }

// better

class Solution {
    
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int m = matrix[0].length;
        int n = matrix.length;
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0)
        {
           
                if( target == matrix[row][col]) 
                {
                   return true;
                }
                else if(target < matrix[row][col])
                {
                    col--;
                }
                else
                {
                    row++;
                }
        }
        return false;
    }
}
