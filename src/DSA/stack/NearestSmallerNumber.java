package DSA.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerNumber {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i< arr.length ;i++){
            if(st.isEmpty()) ans.add(-1);
            else{
                while(st.size()!=0 && st.peek()>= arr[i]) st.pop();
                if(st.size()==0) ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
