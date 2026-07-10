package DSA.greedy;

import java.util.Arrays;

public class ShortestJobFirst {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int t  = 0;
        int sum = 0;
        for(int x : bt){
            sum += t;
            t += x;

        }

        return sum/bt.length;
    }
}
