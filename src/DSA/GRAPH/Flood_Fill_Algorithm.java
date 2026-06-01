package DSA.GRAPH;

public class Flood_Fill_Algorithm {

    public void  DFS(int[][] image , int rows[] , int cols[] , int color,int row , int col,int vis[][] , int iniColor){
        int m = image.length ;
        int n = image[0].length ;
        image[row][col] = color;
        vis[row][col] = 1;

        for(int i  =0;i< 4 ;i++){
            int r = row + rows[i];
            int c = col + cols[i];

            if(r>=0 && r< m && c>=0 && c< n && vis[r][c]==0 && image[r][c]==iniColor){
                DFS(image,rows,cols,color,r,c,vis,iniColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length ;
        int n = image[0].length ;
        int iniColor = image[sr][sc];

        int rows[] = new int[]{-1,0,1,0};
        int cols[] = new int[]{0,1,0,-1};
        int vis[][] = new int[m][n];

        DFS( image ,  rows , cols ,  color,sr,sc,vis,iniColor);
        return image ;
    }
}
