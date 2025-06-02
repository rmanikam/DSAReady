package Stacks;

class Solution {
    // Function to find if there is a celebrity in the party or not.

    // brute force solution
    // public int celebrity(int mat[][]) {
    // code here
    // int n = mat.length;
    // int m = mat[0].length;
    // int[] knowMe = new int[n];
    // int[] iKnow = new int[n];

    // for(int i = 0; i < n; i++)
    // {
    // for(int j = 0; j < m; j++)
    // {
    // if(mat[i][j] == 1)
    // {
    // knowMe[j]++;
    // iKnow[i]++;
    // }
    // }
    // }
    // for(int i = 0; i < n; i++)
    // {

    // if(knowMe[i] == n -1 && iKnow[i] == 0)
    // {
    // return i;
    // }
    // }
    // return -1;
    // }
    // }

    // optimal solution

    public int celebrity(int mat[][]) {
        // code here

        int top = 0;
        int down = mat.length - 1;

        while (top < down) {
            if (mat[top][down] == 1) {
                top++;
            } else if (mat[down][top] == 1) {
                down--;
            } else {
                top++;
                down--;
            }
        }
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            if (i == top) {
                continue;
            }
            if (mat[top][i] == 0 && mat[i][top] == 1) {
                continue;
            } else {
                return -1;
            }
        }
        if (top > down) {
            return -1;
        }
        return top;

    }
}