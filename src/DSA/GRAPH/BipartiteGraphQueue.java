package DSA.GRAPH;

import java.util.*;

public class BipartiteGraphQueue {
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
    private boolean check(int start ,  List<List<Integer>> adj , int col[] ){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        col[start] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it : adj.get(node)){
                if(col[it]==-1){
                    col[it]=1-col[node];
                    q.add(it);
                }
                else if(col[it]==col[node]) return false ;
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {

        int n = graph.length ;
        List<List<Integer>> adj = calculateAdjList(graph);
        int color[] = new int[n];
        Arrays.fill(color,-1);

        for(int i = 0;i<n;i++){
            if(color[i]==-1){
                if(check(i,adj,color)==false) return false;
            }

        }
        return true ;



    }
}
