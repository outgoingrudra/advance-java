package DSA.GRAPH;
import java.util.*;
public class BipartiteGraphRecurrsion {
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
    private boolean check(int node ,int color ,  List<List<Integer>> adj , int col[] ){
        col[node]=color;
        for(int it : adj.get(node)){
            if(col[it]==-1){
                if(check(it,1-color,adj,col)==false) return false;
            }
            else if(col[it]==color) return false ;
        }
        return true ;

    }
    public boolean isBipartite(int[][] graph) {

        int n = graph.length ;
        List<List<Integer>> adj = calculateAdjList(graph);
        int color[] = new int[n];
        Arrays.fill(color,-1);

        for(int i = 0;i<n;i++){
            if(color[i]==-1){
                if(check(i,1,adj,color)==false) return false;
            }

        }
        return true ;



    }

}
