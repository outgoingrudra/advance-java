package DSA.DP;
// We did it using recurrsion and memory
public class KnapSack_01_using_recurrsion_memory {
    public int Calculate(int W , int n , int val[] ,int wt[], int memory[][]){

        if(n==0 || W ==0) return 0 ;
        if(memory[n][W]!=-1) return memory[n][W];
        if(wt[n-1] <= W){

            memory[n][W] = Math.max( val[n-1]+ Calculate(W-wt[n-1],n-1,val,wt,memory),Calculate(W,n-1,val,wt,memory));
            return memory[n][W];

        }
        else {
            memory[n][W] = Calculate(W,n-1,val,wt,memory);
            return memory[n][W];
        }

    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length ;
        int memory[][] = new int[n+1][W+1];
        for(int i = 0 ;i< n+1;i++){
            for(int j  =0;j< W+1;j++){
                memory[i][j]=-1;
            }
        }
        return Calculate(W,n , val ,wt,memory);


    }
}
