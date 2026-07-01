package DSA.stack;

import java.util.Stack;

public class Remove_K_digits {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        String ans = "" ;
        Stack<Character> st = new Stack<>();
        for(char x : num.toCharArray()){
            while(st.size() != 0 && k>0 && st.peek()-'0'> x - '0'){
                st.pop();
                k--;
            }
            st.push(x);
        }
        while(k>0){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";
        while(st.size()!=0){
            ans = st.pop() + ans ;
        }

        int i  = 0;
        while(i < ans.length() &&  ans.charAt(i)=='0'){
            i++;
        }
        ans = ans.substring(i);
        if(ans.equals("")) return "0";
        return ans ;
    }
}
