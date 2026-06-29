package DSA.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Rectangle_in_Binary_Matrix {
    private static ArrayList<Integer> NSL(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            ans.add(st.isEmpty() ? -1 : st.peek());

            st.push(i);
        }
        return ans;
    }

    private static ArrayList<Integer> NSR(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            ans.add(st.isEmpty() ? arr.length : st.peek());

            st.push(i);
        }

        Collections.reverse(ans);
        return ans;
    }

    private static int MAH(int[] arr) {
        int n = arr.length ;
        ArrayList<Integer> left = NSL(arr);
        ArrayList<Integer> right = NSR(arr);
        int ans = 0;
        for(int i = 0;i< n ;i++){
            int width = right.get(i) -left.get(i) -1 ;
            int area = width * arr[i];
            ans = Math.max(ans,area);
        }
        return ans ;
    }


    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, ans = 0;
        int v[] = new int[n];
        for(int i = 0;i< n ;i++){
            v[i]= matrix[0][i] =='1' ? 1 : 0 ;
        }
        ans = MAH(v);

        for(int i = 1 ;i< m ;i++){
            for(int j = 0;j<n ;j++){
                if(matrix[i][j]=='0') v[j]= 0;
                else v[j] = v[j]+1;
            }
            ans = Math.max(ans,MAH(v));
        }
        return ans ;

    }




}
