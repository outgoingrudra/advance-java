package DSA.DP;

public class coin_change_i {
    public static int soln(int coins[] , int s , int n , int memory[][]){
        if(n==0){
            if(s==0) return 1;
            return 0;
        }
        if(memory[n][s]!=-1) return memory[n][s];
        if(coins[n-1]<=s){
            memory[n][s] = soln(coins,s-coins[n-1],n,memory)+ soln(coins,s,n-1,memory);
            return memory[n][s];
        }
        else{
            memory[n][s] =  soln(coins,s,n-1,memory);
            return memory[n][s];
        }
    }
    public int count(int coins[], int sum) {
        // code here.
        int n = coins.length ;
        int memory[][] = new int[n+1][sum+1];
        for(int i =0;i< n+1;i++){
            for(int j = 0;j< sum+1;j++) memory[i][j] = -1;
        }

        return soln(coins,sum , n , memory);
    }
}
