package DSA.GRAPH;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList ;

class DPair {
    int node;
    int distance;

    DPair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

public class Dijkstra {
    public int[] dijkstra(int V, int[][] edges, int src) {

        List<List<DPair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new DPair(v, wt));

            adj.get(v).add(new DPair(u, wt));
        }

        PriorityQueue<DPair> pq =
                new PriorityQueue<>((a, b) -> a.distance - b.distance);

        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);

        dist[src] = 0;
        pq.offer(new DPair(src, 0));

        while (!pq.isEmpty()) {
            DPair curr = pq.poll();

            int node = curr.node;
            int dis = curr.distance;

            if (dis > dist[node]) continue;

            for (DPair it : adj.get(node)) {
                int adjNode = it.node;
                int wt = it.distance;

                if (dis + wt < dist[adjNode]) {
                    dist[adjNode] = dis + wt;
                    pq.offer(new DPair(adjNode, dist[adjNode]));
                }
            }
        }

        return dist;
    }
}
