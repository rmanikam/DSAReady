package BackTracking;

class Solution {
    public boolean isSafe(int row, int col, char[][]board, char val)
    {
        for(int i = 0; i < board.length; i++)
        {
            // check for row
            if(board[row][i] == val)
            {
                return false;
            }
            // check for col
            if(board[i][col] == val)
            {
                return false;
            }
            // check for 3 * 3 matrix
            if(board[3 *(row/3) + i / 3][3 * (col/3) + i % 3] == val)
            {
                return false;
            }
        }
        return true;
    }
    public boolean solve(char[][]board)
    {
        int n = board.length;
        for(int i = 0; i < n; i++)
        {
          for(int j = 0; j < n; j++)
          {
            if(board[i][j] == '.')
            {
                for(char val = '1'; val <= '9'; val++)
                {
                    if(isSafe(i, j, board, val))
                    {
                        board[i][j] = val;
                        boolean ans = solve(board);
                        if(ans)
                        {
                            return true;
                        }
                        else
                        {
                            board[i][j] = '.';
                        }
                    }
                }
                return false;
                
            }
          }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {

       solve(board); 
    }
}