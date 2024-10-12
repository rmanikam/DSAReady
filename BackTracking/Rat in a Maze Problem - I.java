package BackTracking;
import java.util.ArrayList;

class Solution {
    
    boolean isSafe(int newX, int newY, int[][]mat,int n, int[][] vis )
    {
        if( (newX >= 0 && newX < n) && (newY >= 0 && newY < n) && (mat[newX][newY] == 1) && (vis[newX][newY] != 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void solve(int x, int y, int[][] mat,int n,ArrayList<String> ans, int[][] vis, String path   )
    {
        
        if( x == n - 1 && y == n- 1)
        {
            ans.add(path);
            return;
        }
        
        vis[x][y] = 1;
        // 4 conditions
        
        // Down
        
        if(isSafe(x+1, y, mat,n, vis ))
        {
            
            solve(x+1, y, mat, n, ans, vis, path + "D");
            
        }
        // Left
        
         if(isSafe(x, y-1, mat,n, vis ))
        {
          
            solve(x, y-1, mat, n, ans, vis, path + "L");
          
        }
        //Right
         if(isSafe(x, y+1, mat,n, vis ))
        {
           
            solve(x, y+1, mat, n, ans, vis, path + "R");
           
        }
        //Up
         if(isSafe(x-1, y, mat,n, vis ))
        {
           
            solve(x-1, y, mat, n, ans, vis, path + "U");
           
        }
        vis[x][y] = 0;
        
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans = new ArrayList<String>();
   
        if(mat[0][0] == 0)
        {
            return ans;
        }
        int n = mat.length;
        int[][] vis = new int[n][n];
        String path = "";
        solve(0, 0, mat, mat[0].length, ans, vis, path);
        return ans;
    }
}