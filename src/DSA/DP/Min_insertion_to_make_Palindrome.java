package DSA.DP;

public class Min_insertion_to_make_Palindrome {
    public static int countLCS(String a , String b , int m , int n , int memory[][]){
        if(m==0 || n== 0) return 0;
        if(memory[m][n] !=  -1) return memory[m][n];

        if(a.charAt(m-1)==b.charAt(n-1))
            memory[m][n] = countLCS(a,b,m-1,n-1,memory)+1 ;
        else
            memory[m][n] = Math.max(countLCS(a,b,m-1,n,memory),countLCS(a,b,m,n-1,memory));
        return memory[m][n];
    }
    public int minDeletions(String s) {
        String a = s;
        String b = "";
        for(int i = 0; i< s.length();i++)
            b =a.charAt(i) + b;
        int m = s.length();
        int n = m;
        int memory[][] = new int[m+1][n+1];
        for(int i = 0 ;i< m+1 ;i++){
            for(int j = 0; j< n+1 ;j++){
                memory[i][j] = -1 ;
            }
        }
        return  m - countLCS(a,b,m,n,memory);

        // code here

    }
    public int minInsertions(String s) {
        return minDeletions(s);
    }
}
