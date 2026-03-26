package dsa_jan_revision.array2D;
import java.util.Arrays;
public class Q_23_1_Subtract_two_Matrices {
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
          int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};
            int n=arr1.length; int m=arr1[0].length;
          //Note you can only subtract two matrices if they are of same dimesnions
      //Answer is if dimensions are not same matrices cannot be subtracted because extra value 
      // in column or row cannot be subtracted to new matrix 
      if(arr1==null || arr2==null ||arr1.length==0 || arr2.length==0){return ;}
        int resultantArr[][]=new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            resultantArr[i][j]=arr1[i][j]-arr2[i][j];
        }
      }
        System.out.println("Matrices after Subtraction are : ");
      int a=resultantArr.length;
      int b=resultantArr[0].length;
      for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(resultantArr[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println(Arrays.deepToString(resultantArr));
    }
}


