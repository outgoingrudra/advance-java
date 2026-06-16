package DSA.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_largest_elements {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : arr){
            pq.offer(x);
            if(pq.size()>k) pq.poll();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size()>0)
            ans.add(pq.poll());
        Collections.reverse(ans);
        return ans ;


    }
}
