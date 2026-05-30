package DSA.GRAPH;
import java.util.LinkedList;
import java.util.Queue ;
class Pair{
    int row , col , time ;
    Pair(int r , int c , int t){
        row = r; col = c; time = t;
    }
}
public class Rotten_Oranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int vis[][] = new int[m][n];
        int time = 0 ;

        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i<m ;i++){
            for(int j = 0;j< n ;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }

        }
        int rows[] = new int[]{-1,0,1,0};
        int cols[] = new int[]{0,1,0,-1};

        while(!q.isEmpty()){
            Pair p = q.remove() ;
            int r = p.row;
            int c = p.col ;
            int t = p.time ;
            time = Math.max(time , t);

            for(int i = 0;i<4;i++){
                int dr = r+ rows[i];
                int dc = c+ cols[i];
                if(dr>=0 && dr< m && dc>=0 && dc<n && grid[dr][dc]==1 && vis[dr][dc]==0){
                    vis[dr][dc]=1;
                    q.add(new Pair(dr,dc,t+1));
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i<m ;i++){
            for(int j = 0;j< n ;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    cnt +=1;
                    break;

                }
            }
        }
        return cnt==0 ? time : -1 ;







    }
}
