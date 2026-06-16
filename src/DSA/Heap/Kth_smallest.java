package DSA.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : arr){
            pq.offer(x);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}
