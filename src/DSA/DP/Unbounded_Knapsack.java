package DSA.DP;

public class Unbounded_Knapsack {
    public int count(int val[] , int wt[] , int n , int W , int memory[][]){
        if(W==0 || n==0 ) return  0;
        if(memory[n][W]!=-1) return memory[n][W];

        if(wt[n-1]<= W){
            memory[n][W] = Math.max(val[n-1]+count(val,wt,n,W-wt[n-1],memory), count(val,wt,n-1,W,memory));
            return memory[n][W];
        }
        memory[n][W] = count(val,wt,n-1,W,memory);
        return memory[n][W];
    }
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n = wt.length ;
        // memory given
        int memory[][] = new int[n+1][capacity+1];
        for(int i = 0 ;i< n+1;i++){
            for(int j  =0;j< capacity+1;j++){
                if(i==0 || j==0 ){
                    memory[i][j]=0;
                }
                else{
                    memory[i][j]=-1;
                }
            }
        }

        return count(val,wt,n,capacity,memory);


    }
}
