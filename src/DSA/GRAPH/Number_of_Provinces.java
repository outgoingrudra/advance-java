package DSA.GRAPH;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Provinces {
    public static void dfs(List<List<Integer>> adj, int vis[], int ele) {
        vis[ele] = 1;
        for (int x : adj.get(ele)) {
            if (vis[x] == 0) {
                dfs(adj, vis, x);
            }
        }
    }

    public int findCircleNum(int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) adj.add(new ArrayList<>());
        int m = edges.length;
        int n = edges[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (edges[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[] = new int[m];
        int cnt = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (vis[i] == 0) {
                dfs(adj, vis, i);
                cnt++;
            }
        }
        return cnt;
    }
}
