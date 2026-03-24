package dsa_jan_revision.array2D;

import java.util.Arrays;

public class Q_26_Arrays_2D_Matrix_Transpose {
    public static void main(String args[]){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
            matrixTransposeHelper(arr);

           }
           public static void matrixTransposeHelper(int arr[][]){
            int n=arr.length;
            int m=arr[0].length;
            int resultantMatrix[][]=new int[n][m];
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                resultantMatrix[i][j]=arr[j][i];
            }

      }
      System.out.println("Matrix transpose by Regular loop");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
              System.out.print(resultantMatrix[i][j]+" ");
        }
          System.out.println();
      }
      System.out.println("Matrix transpose");
      System.out.println(Arrays.deepToString(resultantMatrix));
 
    }
}
