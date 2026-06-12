package DSA.DP;

public class SubSet_of_given_diff {
    public int count(int arr[] , int sum,int n , int memory[][]){
        if(n==0){
            if(sum ==0) return 1;
            return 0 ;
        }
        if(memory[n][sum] != -1) return memory[n][sum];

        if(arr[n-1]<=sum){
            memory[n][sum] = count(arr,sum-arr[n-1],n-1,memory) + count(arr,sum,n-1,memory);
            return memory[n][sum];
        }
        else{
            memory[n][sum] = count(arr,sum,n-1,memory);
            return memory[n][sum];
        }

    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length ;
        int sum = 0;
        for(int x : arr) sum += x ;
        if ((sum + diff)%2==1) return 0;
        if(diff>sum) return 0;
        int s1 = (sum + diff)/2;

        // memory inits
        int memory[][] = new int[n+1][sum+1];
        for(int i =0; i < n +1;i++){
            for(int j =0 ;j< sum +1;j++){
                memory[i][j]= -1 ;
            }
        }

        return count(arr,s1,n,memory);
    }
}
