package DSA.Heap;

import java.util.PriorityQueue;

public class Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b- a);
        for(int x : stones) pq.offer(x);
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            if(x==y) continue ;
            if(x<y){
                pq.offer(y-x);
            }
            else     pq.offer(x-y);
        }
        if(pq.size()==0) return 0;
        return pq.poll();
    }
}
