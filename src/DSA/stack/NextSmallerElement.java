package DSA.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1;i>=0 ;i--){
            if(st.isEmpty()) ans.add(-1);
            else{
                while(st.size()!=0 && st.peek()>= arr[i]) st.pop();
                if(st.size()==0) ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
