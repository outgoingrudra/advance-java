package DSA.greedy;

import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0 ;
        int j = 0 ;
        for(int i = 0 ;i< g.length ;i++){
            if(j==s.length) break ;
            if(g[i]<=s[j]){
                ans++ ;
                j++ ;
            }
            else {
                j++;
                i--;
            }
        }
        return ans ;
    }
}
