package dsa_jan_revision.array2D;

import java.util.Arrays;

public class Q_21_Arrays_2d_Row_wise_Sum {
    public static void main(String args[]){
       int arr[][]={{1,2,3,4},{4,5,6,7},{8,9,10,11}};
        System.out.println("Original Matrix: " + Arrays.deepToString(arr));
       long rowSums[]= rowWiseSumHelper(arr);
          System.out.println("Row-wise sums: " + Arrays.toString(rowSums));
    }
    public static long[] rowWiseSumHelper(int arr[][]){
        if(arr==null || arr.length==0){return new long[0];}
        int n=arr.length;
          long[] result = new long[n];

        for(int i=0;i<n;i++){
            long sum=0;
            int currentCol=arr[i].length;
            for(int j=0;j<currentCol;j++){
                sum=sum+arr[i][j];
            }
            result[i] = sum; 
        }
        return result;
    }
    
}
