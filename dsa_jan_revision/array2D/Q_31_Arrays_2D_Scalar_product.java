package dsa_jan_revision.array2D;

import java.util.Arrays;

public class Q_31_Arrays_2D_Scalar_product {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         System.out.println("Original matrix : \n"+Arrays.deepToString(arr));
           printMatrix(arr);
        int k=2;
        scalarProductHelper(arr,k);
    }
    public static void scalarProductHelper(int arr[][],int k){
        if(arr==null || arr.length==0){return ;}
            int n=arr.length;
            int m=arr[0].length;
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                arr[i][j]=arr[i][j]*k;
             }   
            }
         System.out.println(" matrix after product : \n"+Arrays.deepToString(arr));
            printMatrix(arr);
    }
    public static void printMatrix(int arr[][]){
         int n=arr.length;
            int m=arr[0].length;
            for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
             }   
            System.out.println();
        }
    }
}
