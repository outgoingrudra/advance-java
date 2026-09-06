package DSA.prefixSum_HAshMAp_HArd;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        int nums[] = new int[]{2, 5, 4, 7, 6, 3};
        int k  = 3 ;


        int ans = 0 ;
        Map<String , Integer> mpp = new HashMap<>();
        mpp.put("0_0",-1);
        int balance = 0 ;
        int sum =  0;
        for(int i = 0  ; i < nums.length ;i++){
            if(nums[i]%2==0) balance++;
            else balance--;
            sum +=  nums[i];
            int rem =  (sum)%k ;
            if(rem < 0) rem += k ;
            int need = -balance ;
            if(mpp.containsKey(rem+"_"+need)){
                ans = Math.max(ans , i - mpp.get(rem+"_"+need));
            }
            if(!mpp.containsKey(rem+"_"+balance)) mpp.put(rem+"_"+balance , i  );
        }
        System.out.println(ans);
    }
}
