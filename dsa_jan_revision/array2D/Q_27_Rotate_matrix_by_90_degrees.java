package dsa_jan_revision.array2D;
import java.util.Arrays;
public class Q_27_Rotate_matrix_by_90_degrees {
   public static void main(String args[]){
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Original Matrix : \n"+Arrays.deepToString(arr));
    rotate90DegreeHelper(arr);
   }
   public static void rotate90DegreeHelper(int arr[][]){
    if(arr==null || arr.length==0){return ;}
    int n=arr.length;    int m=arr[0].length;
    //Step1 : do Matrix tranpose
      for(int i=0;i<n;i++){
         for(int j=i+1;j<m;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
         }
      }
 System.out.println("Transpose Matrix : \n"+Arrays.deepToString(arr));
    //Step2 : Reverse the Matrix row by row
      for(int i=0;i<n;i++){
      int start=0;int end=m-1;
      
         while(start<end){
            int temp=arr[i][start];
            arr[i][start]=arr[i][end];
            arr[i][end]=temp;
            start++;end--;
         }
      }
       System.out.println("90 Degree Rotated Matrix : \n"+Arrays.deepToString(arr));
   } 
}
