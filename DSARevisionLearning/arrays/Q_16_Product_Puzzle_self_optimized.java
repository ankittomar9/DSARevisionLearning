package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_16_Product_Puzzle_self_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int n=arr.length;
        long ans[]=new long[n];
        //left product
        
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        System.out.println("After left pass:  " + Arrays.toString(ans));
        //right product
        long right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*arr[i];
        }

    System.out.println("Final Result: " + Arrays.toString(ans));
    
    
    }
    
}
