package DSA.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length ;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ;i>=0 ;i--) {
            if(st.size()==0)ans.add(-1);
            else{
                while(st.size()!=0 && st.peek() <= arr[i]){
                    st.pop();
                }
                if(st.size()==0) ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans ;

    }
}
