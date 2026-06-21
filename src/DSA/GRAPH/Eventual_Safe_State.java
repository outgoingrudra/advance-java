package DSA.GRAPH;

import java.util.ArrayList;
import java.util.List;

public class Eventual_Safe_State {
    private static List<List<Integer>> calculateAdjList(int[][] arr){
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i =0 ; i< arr.length ;i++){
            ans.add(new ArrayList<>());
            for(int x : arr[i]){
                ans.get(i).add(x);
            }
        }
        return ans;

    }
    public boolean DFS(int node , List<List<Integer>> adj , int vis[] ,int pathVis[],int check[]){
        vis[node] = 1;
        pathVis[node]=1;
        check[node] =0;
        for(int it : adj.get(node)){
            if(vis[it]==0){
                if( DFS(it,adj,vis,pathVis,check)) return true;
            }
            else if(pathVis[it]==1) return true ;
        }
        pathVis[node] =0;
        check[node] = 1;
        return false ;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length ;
        List<List<Integer>> adj  = calculateAdjList(graph);
        int vis[] = new int[n];
        int check[] = new int[n];
        int pathVis[] = new int[n];
        for(int i = 0;i< n ;i++){
            if(vis[i]==0){
                DFS(i,adj,vis,pathVis,check);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i< n ;i++){
            if(check[i]==1) ans.add(i);
        }
        return ans ;
    }
}
