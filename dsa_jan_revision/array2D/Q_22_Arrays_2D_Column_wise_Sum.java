package dsa_jan_revision.array2D;

import java.util.Arrays;

public class Q_22_Arrays_2D_Column_wise_Sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                     System.out.println("Original Matrix: " + Arrays.deepToString(arr));
        long colSums[]=columnRowSumHelper(arr);
        System.out.println("Column Wise Sum is : "+Arrays.toString(colSums));
    }
    public static long[] columnRowSumHelper(int arr[][]){
        if(arr==null ||arr.length==0){return new long[0];}
        int n=arr.length;
        int m=arr[0].length;
          long result[]=new long[m];
        for(int j=0;j<m;j++){
            long sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i][j];
            }
             result[j]=sum;       
            }

        return result;
    }
}
