package DSA.GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public boolean isCyclic_Using_TopoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++) adj.add(new ArrayList<>());
        for(int it[] : edges) adj.get(it[0]).add(it[1]);
        int indegree[] = new int[V];
        for(int i =0;i<V;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i< V;i++){
            if(indegree[i]==0) q.offer(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            if(ans.size()==V) return false ;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }

        }
        return true   ;
    }
}
