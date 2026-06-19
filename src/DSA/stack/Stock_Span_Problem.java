package DSA.stack;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
    int ele;
    int idx ;
    Pair(int ele,int idx){
        this.ele = ele ;
        this.idx = idx ;
    }
}
public class Stock_Span_Problem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer>  ans = new ArrayList<>();
        int n = arr.length ;

        for(int i = 0;i< n ;i++){
            if(st.size()==0){
                ans.add(1);
            }
            else{

                while(st.isEmpty()==false && st.peek().ele<= arr[i]){
                    st.pop();
                }
                if(st.size()==0) ans.add(i+1);
                else{
                    ans.add(i-st.peek().idx);
                }

            }
            st.add(new Pair(arr[i],i));
        }
        return ans ;


    }
}
