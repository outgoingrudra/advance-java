package DSA.GRAPH;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle_Directed_Graph {
    public boolean DFS(int node , List<List<Integer>> adj , int vis[] ,int pathVis[]){
        vis[node] = 1;
        pathVis[node]=1;
        for(int it : adj.get(node)){
            if(vis[it]==0){
                if( DFS(it,adj,vis,pathVis)) return true;
            }
            else if(pathVis[it]==1) return true ;
        }
        pathVis[node] =0;
        return false ;
    }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        for(int i =0;i<V;i++) adj.add(new ArrayList<>());

        for(int it[] : edges){
            adj.get(it[0]).add(it[1]);

        }

        for(int i = 0;i< V ;i++){
            if(vis[i]==0){
                if(DFS(i,adj,vis,pathVis)) return true ;
            }
        }
        return false ;

    }
}
