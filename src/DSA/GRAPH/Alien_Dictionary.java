package DSA.GRAPH;
import java.util.*;
public class Alien_Dictionary {
    public String findOrder(String[] words) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[26];
        boolean[] present = new boolean[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                present[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            if (s1.length() > s2.length() && s1.startsWith(s2)) {
                return "";
            }

            int len = Math.min(s1.length(), s2.length());

            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    int u = s1.charAt(j) - 'a';
                    int v = s2.charAt(j) - 'a';

                    adj.get(u).add(v);
                    indegree[v]++;

                    break;
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();

        int totalChars = 0;
        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                totalChars++;
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int count = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            ans.append((char) (node + 'a'));
            count++;

            for (int nbr : adj.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    q.offer(nbr);
                }
            }
        }

        if (count != totalChars) {
            return "";
        }

        return ans.toString();
    }
}
