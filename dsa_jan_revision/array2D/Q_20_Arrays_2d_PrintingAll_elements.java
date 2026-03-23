package dsa_jan_revision.array2D;

import java.util.Arrays;

public class Q_20_Arrays_2d_PrintingAll_elements {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("--- Using Traditional Nested Loops ---");
        printMatrix(arr);

        System.out.println("\n--- Using Inbuilt Function ---");
        System.out.println(Arrays.deepToString(arr));
    }
    public static void printMatrix(int arr[][]){
        if(arr==null || arr.length==0) {return;}
        
        int n=arr.length;

        for(int i=0;i<arr.length;i++){
            int m=arr[i].length;
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
