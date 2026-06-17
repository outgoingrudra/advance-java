package DSA.DP;
import java.util.HashMap ;
public class Scrambled_String {
    static HashMap<String, Boolean> memo = new HashMap<>();

    private static boolean solve(String a, String b) {

        if (a.equals(b))
            return true;

        String key = a + " " + b;

        if (memo.containsKey(key))
            return memo.get(key);

        int n = a.length();

        for (int i = 1; i < n; i++) {

            // Swap
            if (solve(a.substring(0, i), b.substring(n - i)) &&
                    solve(a.substring(i), b.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }

            // No Swap
            if (solve(a.substring(0, i), b.substring(0, i)) &&
                    solve(a.substring(i), b.substring(i))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    static boolean isScramble(String S1, String S2) {

        memo.clear();

        if (S1.length() != S2.length())
            return false;

        return solve(S1, S2);
    }
}
