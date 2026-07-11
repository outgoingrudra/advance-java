package DSA.greedy;

import java.util.Arrays;

public class MinimumPlatform {
    public int minPlatform(int arr[], int dep[]) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;

        int i = 0, j = 0;
        int platforms = 0;
        int ans = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platforms++;
                ans = Math.max(ans, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }

        return ans;
    }
}
