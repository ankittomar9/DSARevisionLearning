package DSARevisionLearning.arrays2D;
import java.util.Arrays;
public class Q_28_Rotate_Matrix_by_90_Clockwise {
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;        int m=matrix.length;
        if(n==0 || m==0){
            System.out.println("Matrix is empty");return;
        }
        //step1 first do matrix transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         System.out.println("Matrix after transpose");
        System.out.println(Arrays.deepToString(matrix));
        //reverse the rows
        for(int row=0;row<n;row++){
              int left=0;int right=m-1;
        while(left<right){
            int temp=matrix[row][left];
            matrix[row][left]=matrix[row][right];
            matrix[row][right]=temp;
            left++;right--;
        }
     }
           System.out.println("\nMatrix after rotation");
          System.out.println(Arrays.deepToString(matrix));
    }    
}
