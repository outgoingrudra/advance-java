package DSA.stack;

import java.util.Stack;

public class minMaxStack {
    Stack<Integer> st ;
    Stack<Integer> mini;
    Stack<Integer> maxi;
    public minMaxStack(){
        st = new Stack<>();
        mini = new Stack<>();
        maxi= new Stack<>();
    }
    public void push(int val){
        st.push(val);
        if(mini.isEmpty() || mini.peek()>=val) mini.push(val);
        if(maxi.isEmpty() || maxi.peek()<=val) maxi.push(val);
    }
    public int pop()  throws Exception {
          if(st.isEmpty()) throw new Exception("Could not pop from an Empty minMax Stack ");
          int elementPopped = st.pop();
          if(elementPopped==mini.peek()) mini.pop();
          if(elementPopped==maxi.peek()) maxi.pop();
          return elementPopped ;

    }
    public int peek() throws  Exception{
        if(st.isEmpty()) throw new Exception("Could not peek from an Empty minMax Stack ");
        return st.peek();
    }
    public int getMin()  throws  Exception{
        if(st.isEmpty()) throw new Exception("Could not get Min from an Empty minMax Stack ");
        return mini.peek();
    }
    public int getMax()  throws  Exception{
        if(st.isEmpty()) throw new Exception("Could not get Max from an Empty minMax Stack ");
        return maxi.peek();
    }
    public int size(){
        return st.size();
    }
}
