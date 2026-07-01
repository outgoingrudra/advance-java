package DSA.stack;

import java.util.Stack;

public class Astroid_Collison {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int x : asteroids){
            if(x>0) st.push(x);
            else {
                while(st.size() !=0 && st.peek()>0 && st.peek() < -x) st.pop();
                if(st.isEmpty() || st.peek() < 0) st.push(x);
                if(st.peek()==-x) st.pop();
            }
        }
        int res[] = new int[st.size()];
        int i = st.size()-1;
        while(st.size()!=0){
            res[i--]=st.pop();
        }
        return res ;

    }
}
