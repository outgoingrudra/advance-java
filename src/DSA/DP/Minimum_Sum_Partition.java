package DSA.DP;

public class Minimum_Sum_Partition {
    public boolean checkSubsetSum(int arr[] , int n , int s , int memory[][]){
        if(n==0){
            if(s==0) return true ;
            return false ;
        }
        if(memory[n][s] != -1) return memory[n][s] == 1;

        if(arr[n-1]<=s){
            memory[n][s] = (checkSubsetSum(arr,n-1,s-arr[n-1],memory) || checkSubsetSum(arr,n-1,s,memory)) ? 1 : 0;
            return memory[n][s] ==1  ;
        }
        else{
            memory[n][s] = checkSubsetSum(arr,n-1,s,memory) ? 1 : 0 ;
            return memory[n][s] == 1 ;
        }
    }


    public int minDifference(int[] nums) {

        int n = nums.length ;
        int sum = 0;
        for(int x : nums) sum += x;


        // memory initalizatioon
        int memory[][] = new int[n+1][sum+1];
        for(int i = 0;i< n+1;i++){
            for(int j = 0;j<sum+1;j++){
                memory[i][j]=-1;
            }
        }
        int min = sum ;
        for(int s1 =0;s1<= sum/2;s1++){
            if(checkSubsetSum(nums , n , s1 , memory)){
                min = Math.min(min,Math.abs(sum-2*s1));
            }
        }
        return min;

    }

}
