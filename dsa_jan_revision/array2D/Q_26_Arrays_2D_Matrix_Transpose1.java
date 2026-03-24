  package dsa_jan_revision.array2D;
import java.util.Arrays;
public class Q_26_Arrays_2D_Matrix_Transpose1 {
    public static void main(String args[]){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix:");
        System.out.println(Arrays.deepToString(arr));
            matrixTransposeHelper(arr);
           }
           public static void matrixTransposeHelper(int arr[][]){
            int n=arr.length;
            int m=arr[0].length;
            for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
               int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
      }
      System.out.println("Matrix transpose by Regular loop");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
              System.out.print(arr[i][j]+" ");
        }
          System.out.println();
      }
      System.out.println("Matrix transpose using Library Printing");
      System.out.println(Arrays.deepToString(arr));
     }
}


