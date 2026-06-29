package DSA.stack;

public class Trapping_Rain_Water {
    public int trap(int[] arr) {
        int n = arr.length ;
        if(n==0 ) return 0 ;
        int mxl[] = new int[n];
        int mxr[] = new int[n];
        // Prefix maximum
        mxl[0] = arr[0];
        for (int i = 1; i < n; i++) {
            mxl[i] = Math.max(mxl[i - 1], arr[i]);
        }

        // Suffix maximum
        mxr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mxr[i] = Math.max(mxr[i + 1], arr[i]);
        }
        int water = 0;
        for(int i = 0 ;i< n ;i++){
            water += Math.min(mxl[i],mxr[i])- arr[i];
        }
        return water ;
    }
}
