package DSA.stack;

import java.util.Stack;

public class Min_Stack_ES {

    private Stack<Integer> s;
    private Stack<Integer> ss;
    public Min_Stack_ES() {
        s = new Stack<>();
        ss = new Stack<>();
    }

    public void push(int val) {
        s.push(val);
        if(ss.size()==0 || ss.peek()>= val) ss.push(val);
    }

    public void pop() {
        if(s.size()==0) return ;
        int ans = s.pop();
        if(ans==ss.peek()) ss.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        if(ss.size()==0) return -1;
        return ss.peek();
    }
}
