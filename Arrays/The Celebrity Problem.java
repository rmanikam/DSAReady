package Arrays;


// brute force
// class Solution {
// public int celebrity(int mat[][]) {

//     int m = mat.length;
//     int n = mat[0].length;

//     int [] knowMe = new int[m];
//     int [] IKnow  = new int[m];

//     for(int i = 0; i < m; i++)
//     {
//         for(int j = 0; j < n; j++)
//         {
//             if(mat[i][j] == 1)
//             {
//                 knowMe[j]++;
//                 IKnow[i]++;

//             }
//         }
//     }

//     for(int i = 0; i < m; i++)
//     {
//       if(knowMe[i] == m - 1  && IKnow[i] == 0)
//       {
//         return i;
//       }
//     }
//     return -1;
//  }
// }
// T.C is O(N * N)
// SC is O(N)
// optimal


class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        
        int m = mat.length;
        int top = 0;
        int down = m - 1;
        
        while(top < down)
        {
            if(mat[top][down] == 1)
            {
                
                top++;
            }
            else if(mat[down][top] == 1)
            {
                down--;
            }
            else
            {
                top++;
                down--;
            }
        }
        if(top > down)
        {
            return -1;
        }
        for(int i = 0; i < m; i++)
        {
            if(i == top)
            {
                continue;
            }
            if((mat[top][i] == 0) && mat[i][top] == 1)
            {
                continue;
            }
            else
            {
                return -1;
            }
        }
        return top;
        
    }
}

// TC is O(N+N)
// SC is O(1)