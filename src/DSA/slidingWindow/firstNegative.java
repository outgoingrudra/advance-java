package DSA.slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegative {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        Queue<Integer> q = new LinkedList<>() ;
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>() ;
        while (j < arr.length) {

            if (arr[j] < 0)
                q.offer(arr[j]);

            if (j - i + 1 < k) {
                j++;
            } else {

                ans.add(q.isEmpty() ? 0 : q.peek());

                if (!q.isEmpty() && arr[i] == q.peek())
                    q.poll();

                i++;
                j++;
            }
        }
        return ans ;
    }
}
