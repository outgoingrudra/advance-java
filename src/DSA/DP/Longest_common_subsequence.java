package DSA.DP;

public class Longest_common_subsequence {
    static int count(String x , String y, int n , int m , int[][] memory){
        if(n==0 || m==0) return 0;
        if(memory[n][m]!=-1) return memory[n][m];

        if(x.charAt(n-1)==y.charAt(m-1)){
            memory[n][m] = 1+ count(x,y,n-1,m-1,memory);
        }
        else{
            memory[n][m] = Math.max(count(x,y,n-1,m,memory),count(x,y,n,m-1,memory));
        }
        return memory[n][m];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int memory[][] = new int[n+1][m+1];
        for(int i =0;i< n+1;i++){
            for(int j =0;j< m+1;j++){
                memory[i][j] = -1;
            }
        }
        return count(text1,text2,n,m,memory);

    }
}
