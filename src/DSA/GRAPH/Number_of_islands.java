package DSA.GRAPH;
//
//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//

public class Number_of_islands {
    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int vis[][] = new int[m][n];
        int cnt = 0;
        int rows[] = new int[]{-1,0,1,0};
        int cols[] = new int[]{0,1,0,-1};

        for(int i =0;i  < m ;i++){
            for(int j =0 ;j< n ;j++){
                if(grid[i][j]=='1'){
                    if(vis[i][j]==0)
                    {
                        DFS(grid , i , j,vis,rows,cols);
                        cnt++;
                    }
                }
            }

        }
        return cnt ;
    }

    private void DFS(char grid[][], int i , int j , int vis[][],int rows[] , int cols[]){
        int m = grid.length ;
        int n = grid[0].length ;
        vis[i][j]=1;
        for(int c =0;c< 4 ;c++){
            int dr = i + rows[c];
            int dc = j + cols[c];
            if(dr>=0 && dr< m && dc>=0 && dc<n  && grid[dr][dc]=='1' && vis[dr][dc]==0){
                DFS(grid,dr,dc,vis,rows,cols);
            }
        }

    }

}
