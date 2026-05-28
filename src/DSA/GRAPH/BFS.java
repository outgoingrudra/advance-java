package DSA.GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>() ;
        int[] vis = new int[adj.size()];

        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int elem = q.poll() ;
            ans.add(elem);
            for(int x : adj.get(elem))
            {
                if(vis[x]==0){
                    q.add(x);
                    vis[x]=1;
                }
            }
        }
        return ans ;
    }

}
