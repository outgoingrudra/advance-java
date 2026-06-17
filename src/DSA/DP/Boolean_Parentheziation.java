package DSA.DP;

import java.util.HashMap;
import java.util.Map;

public class Boolean_Parentheziation {
    static Map<String,Integer> mpp = new HashMap<>();
    private  static int solve(String s , int i , int j , boolean isTrue){
        if(i>j) return 0;
        if(i==j){
            if(isTrue) return s.charAt(i) == 'T' ? 1 : 0;
            else return s.charAt(i) =='F' ? 1 : 0 ;
        }
        String t = String.valueOf(i);
        t+= " ";
        t += String.valueOf(j);
        t+= " "+ (isTrue ? "T" : "F");
        if(mpp.containsKey(t)) return mpp.get(t);
        int ans = 0;

        for(int k = i+1 ;k< j;k+=2){
            int lt = solve(s,i,k-1, true);
            int lf = solve(s,i,k-1, false);
            int rt = solve(s,k+1,j,true);
            int rf = solve(s,k+1,j,false);

            if(s.charAt(k)=='&'){
                if(isTrue){
                    ans += lt*rt;
                }
                else ans += lf*rf + lt*rf + lf*rt ;
            }
            else if(s.charAt(k)=='|'){
                if(isTrue){
                    ans += lt*rt + lt*rf + lf*rt;
                }
                else ans += lf*rf  ;
            }
            else {
                if(isTrue){
                    ans +=  lt*rf + lf*rt;
                }
                else ans += lf*rf + lt*rt   ;
            }

        }
        mpp.put(t,ans);
        return ans ;
    }

    static int countWays(String s) {
        // code here
        mpp.clear();
        return solve(s,0,s.length()-1,true);

    }
}
