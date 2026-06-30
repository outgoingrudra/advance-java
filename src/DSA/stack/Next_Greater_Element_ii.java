package DSA.stack;

import java.util.Stack;

public class Next_Greater_Element_ii {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length ;
        int []ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n -1 ;i>=0 ;i--){

            while(st.size()!=0 && st.peek()<= arr[i%n]) st.pop();
            if(i<n){
                if(st.size()==0) ans[i%n] = -1;
                else ans[i%n] = st.peek();

            }
            st.push(arr[i%n]);
        }
        return ans;
    }
}
