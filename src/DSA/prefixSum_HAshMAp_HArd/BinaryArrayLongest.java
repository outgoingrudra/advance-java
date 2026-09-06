package DSA.prefixSum_HAshMAp_HArd;

import java.util.HashMap;
import java.util.Map;

public class BinaryArrayLongest {
    public static void main(String[] args) {
        int nums[] = new int[]{0,1,0,1,1,0};
        int k  = 2 ;


        int ans = 0 ;
        Map<String , Integer> mpp = new HashMap<>();
        mpp.put("0_0",-1);
        int balance = 0 ;
        int sum =  0;
        for(int i = 0  ; i < nums.length ;i++){
            if(nums[i]==1) balance++;
            else balance--;
            int rem = (i+1)%k ;
            int need = -balance ;
            if(mpp.containsKey(rem+"_"+need)){
                ans = Math.max(ans , i - mpp.get(rem+"_"+need));
            }
            if(!mpp.containsKey(rem+"_"+balance)) mpp.put(rem+"_"+balance , i  );
        }
        System.out.println(ans);
    }
}
