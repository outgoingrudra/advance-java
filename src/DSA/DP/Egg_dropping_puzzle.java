package DSA.DP;

public class Egg_dropping_puzzle {
    static int[][] mem = new int[1001][1001];

    static int solve(int e, int f) {

        if (f == 0 || f == 1) return f;
        if (e == 1) return f;

        if (mem[e][f] != -1) return mem[e][f];

        int low = 1;
        int high = f;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int left = solve(e - 1, mid - 1);
            int right = solve(e, f - mid);

            int temp = 1 + Math.max(left, right);

            ans = Math.min(ans, temp);

            if (left < right) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return mem[e][f] = ans;
    }

    static int eggDrop(int n, int k) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                mem[i][j] = -1;
            }
        }

        return solve(n, k);
    }
}
