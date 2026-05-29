package DSA.GRAPH;

import java.util.ArrayList;

 class DFS {
    public static void  Travel(ArrayList<ArrayList<Integer>> adj , int vis[], ArrayList<Integer> ans, int elem){

        ans.add(elem);
        vis[elem] = 1;
        for(int x : adj.get(elem)){
            if(vis[x]==0){
                Travel(adj,vis,ans,x);

            }
        }

    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[adj.size()];

        Travel(adj,vis,ans, 0);
        return ans ;
    }
}
