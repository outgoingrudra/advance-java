package DSA.DP;

public class Longest_repeating_subsequence {
    public int LongestRepeatingSubsequence(String s) {
        // code here
        String text1 = s ;
        String text2 = s ;
        int n = text1.length();
        int m = text2.length();

        int memory[][] = new int[n+1][m+1];
        for(int i =0;i< n+1;i++){
            for(int j =0;j< m+1;j++){
                if(i==0 ||j==0)   memory[i][j] = 0;
            }
        }

        for(int i =1;i< n+1;i++){
            for(int j =1;j< m+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1) && i!=j ){
                    memory[i][j] = 1+ memory[i-1][j-1];
                }
                else{
                    memory[i][j] = Math.max(memory[i-1][j],memory[i][j-1]);
                }
            }
        }
        return memory[n][m];

    }
}
