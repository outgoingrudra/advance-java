package DSA.GRAPH;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopoSort {
    private static void DFS(int n , List<List<Integer>> adj , int vis[] , Stack<Integer> st ){
        vis[n]=1;
        for(int it : adj.get(n)){
            if(vis[it]==0)
                DFS(it,adj,vis,st);
        }
        st.push(n);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++) adj.add(new ArrayList<>());
        for(int it[] : edges) adj.get(it[0]).add(it[1]);
        int vis[] = new int[V];


        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i< V ;i++){
            if(vis[i]==0) DFS(i,adj,vis,st);
        }
        ArrayList<Integer> ans=new  ArrayList<>();
        while(st.isEmpty()==false) ans.add(st.pop());
        return ans ;

    }
}
