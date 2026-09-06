package DSA.prefixSum_HAshMAp_HArd;

import java.util.HashMap;
import java.util.Map;

public class Xor_sum_0_len_even {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 3, 1, 2, 3, 4};



        int ans = 0 ;
        Map<String , Integer> mpp = new HashMap<>();
        mpp.put("0_0",-1) ;
        int xor =  0;
        for(int i = 0  ; i < nums.length ;i++){
          xor ^= nums[i];
            int flag = (i + 1) % 2;
          if(mpp.containsKey(xor+"_"+flag)){
              ans = Math.max(ans , i - mpp.get(xor+"_"+flag));
          }
          else mpp.put(xor+"_"+flag, i);
        }
        System.out.println(ans);
    }
}
