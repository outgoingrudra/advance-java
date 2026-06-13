package DSA.DP;

import java.util.Arrays;

public class Longest_common_substring {
    static int max;

    static int count(String x, String y, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) return 0;

        if (dp[n][m] != -1) return dp[n][m];

        // Explore other states
        count(x, y, n - 1, m, dp);
        count(x, y, n, m - 1, dp);

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            dp[n][m] = 1 + count(x, y, n - 1, m - 1, dp);
            max = Math.max(max, dp[n][m]);
        } else {
            dp[n][m] = 0;
        }

        return dp[n][m];
    }

    public int longCommSubstr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        max = 0;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        count(s1, s2, n, m, dp);

        return max;
    }
}
