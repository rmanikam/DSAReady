package BackTracking;
import java.util.List;
import java.util.ArrayList;

class Solution {

    void addOutput(List<List<String>> board, List<List<String>> ans, int n )
    {
         List<String> temp = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < n; j++)
            {
               row.append(board.get(i).get(j));
            }
            temp.add(row.toString());
        }
        ans.add(temp);
    }
    boolean isSafe(int row, int col, List<List<String>> board, int n )
    {
        
        int x = row;
        int y = col;
        
        // check for row
            while(y >= 0){
                if(board.get(x).get(y).equals("Q"))
                {
                    return false;
                }
                 y--;
            }

           // check for upper left diagnol
            
            x = row;
            y = col;

            while(x >= 0 && y >= 0)
            { 
              if(board.get(x).get(y).equals("Q"))
              {
                return false;
              }
              x--;
              y--;
            }
            
            x = row;
            y = col;

           // check for bottom left diagnol
            
            while(x < n && y >= 0)
            {
              if(board.get(x).get(y).equals("Q"))
              {
                return false;
              }
              x++;
              y--;
            }
      return true;
    }
    void solve(int col, List<List<String>> board, List<List<String>> ans, int n ) { 
        if(col == n )
        {
           addOutput(board, ans, n );
           return;      
        }
        for(int row = 0; row < n; row++)
        {
            if(isSafe(row, col, board, n))
            {
                board.get(row).set(col, "Q"); 
                solve(col+1, board, ans, n);
                //backtracking
                board.get(row).set(col, "."); 

            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");  
            }
            board.add(row);
        }
           solve(0, board, ans, n);
           return ans;
    }
}