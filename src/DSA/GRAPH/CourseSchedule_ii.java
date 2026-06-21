package DSA.GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_ii {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses ;
        int[][] edges =  prerequisites;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++) adj.add(new ArrayList<>());
        for(int it[] : edges) adj.get(it[1]).add(it[0]);
        int indegree[] = new int[V];
        for(int i =0;i<V;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();


        for(int i = 0;i< V;i++){
            if(indegree[i]==0) q.offer(i);
        }
        int[] ans =  new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            ans[i++]= node;

            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }

        }
        if(i != V) return new int[0];

        return ans    ;

    }
}
