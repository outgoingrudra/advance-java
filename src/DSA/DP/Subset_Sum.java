package DSA.DP;

public class Subset_Sum {
    public static boolean calculate(int arr[], int sum, int n, int memory[][]) {

        if (sum == 0) return true;
        if (n == 0) return false;

        if (memory[n][sum] != -1)
            return memory[n][sum] == 1;

        boolean ans;

        if (arr[n - 1] <= sum) {
            ans = calculate(arr, sum - arr[n - 1], n - 1, memory)
                    || calculate(arr, sum, n - 1, memory);
        } else {
            ans = calculate(arr, sum, n - 1, memory);
        }

        memory[n][sum] = ans ? 1 : 0;
        return ans;
    }

    static Boolean isSubsetSum(int arr[], int sum) {

        int n = arr.length;
        int memory[][] = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                memory[i][j] = -1;
            }
        }

        return calculate(arr, sum, n, memory);
    }
}
