package DSA.DP;

public class Palindromic_Partitioning {

    static int palPartition(String s) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];

        // Precompute palindromes
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {

                if (gap == 0)
                    pal[i][j] = true;

                else if (gap == 1)
                    pal[i][j] = (s.charAt(i) == s.charAt(j));

                else
                    pal[i][j] = (s.charAt(i) == s.charAt(j))
                            && pal[i + 1][j - 1];
            }
        }

        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (pal[i][n - 1]) {
                dp[i] = 0;
                continue;
            }

            int minCuts = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                if (pal[i][j]) {
                    minCuts = Math.min(minCuts, 1 + dp[j + 1]);
                }
            }

            dp[i] = minCuts;
        }

        return dp[0];
    }
}
