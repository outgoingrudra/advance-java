package DSA.LinkedList.randomQuestions;

import java.util.ArrayList;

public class Pair_sum {
    static DNode TailFind(DNode h){
        while(h.next != null ){
            h = h.next;
        }
        return h ;
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      DNode head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(head==null) return ans ;
        DNode left = head ;
        DNode right = TailFind(head);


        while(left.data < right.data ){
            int s = left.data+right.data;
            if(s==target){
                ArrayList<Integer> out = new ArrayList<>();
                out.add(left.data);
                out.add(right.data);
                ans.add(out);
                left = left.next ;
                right = right.prev ;
            }
            else if(s<target){
                left = left.next;
            }
            else right = right.prev ;

        }
        return ans ;
    }
}
