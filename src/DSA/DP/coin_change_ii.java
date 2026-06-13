package DSA.DP;

public class coin_change_ii {
    public int soln(int coins[] , int sum , int n , int memory[][]){
        if(n==0) {
            return Integer.MAX_VALUE-1;
        }
        if(sum==0) return 0 ;
        if(memory[n][sum]!=-1) return memory[n][sum];
        if(coins[n-1]<=sum){
            memory[n][sum] = Math.min(soln(coins,sum-coins[n-1],n,memory)+1, soln(coins,sum,n-1,memory));
            return memory[n][sum] ;
        }
        else{
            memory[n][sum] = soln(coins,sum,n-1,memory);
            return memory[n][sum] ;
        }
    }
    public int coinChange(int[] coins, int sum) {
        int n = coins.length ;
        int memory[][] = new int[n+1][sum+1];
        for(int i =0;i< n+1;i++){
            for(int j = 0;j< sum+1;j++) memory[i][j] = -1;
        }

        int ans = soln(coins,sum , n , memory);
        return ans >= Integer.MAX_VALUE - 1 ? -1 : ans;
    }
}
