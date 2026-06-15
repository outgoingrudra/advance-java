package DSA.DP;

public class Shortest_common_supersequence_length {
    public static int countLCS(String a , String b , int m , int n , int memory[][]){
        if(m==0 || n== 0) return 0;
        if(memory[m][n] !=  -1) return memory[m][n];

        if(a.charAt(m-1)==b.charAt(n-1))
            memory[m][n] = countLCS(a,b,m-1,n-1,memory)+1 ;
        else
            memory[m][n] = Math.max(countLCS(a,b,m-1,n,memory),countLCS(a,b,m,n-1,memory));
        return memory[m][n];
    }
    public static int minSuperSeq(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();

        int memory[][] = new int[m+1][n+1];
        for(int i = 0 ;i< m+1 ;i++){
            for(int j = 0; j< n+1 ;j++){
                memory[i][j] = -1 ;
            }
        }

        int lcs = countLCS(s1 ,s2 , m , n , memory);
        return m+n - lcs ;
    }
}
