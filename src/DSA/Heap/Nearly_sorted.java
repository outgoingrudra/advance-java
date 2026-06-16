package DSA.Heap;

import java.util.PriorityQueue;

public class Nearly_sorted {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i  = 0;
        for(int x : arr){
            pq.add(x);
            if(pq.size()>k){
                arr[i++] = pq.poll();
            }
        }
        while(i<arr.length){
            arr[i++] = pq.poll();
        }
    }
}
