package DSARevisionLearning.arrays2D;
import java.util.Arrays;
public class Q_25_Array_2D_Scalar_Addition_Multiplication {
    public static void  main(String args[]){
        long mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         long mat1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        long a=2; long b=2;

        int n=mat.length;  int m=mat[0].length; int x=mat1.length;int y=mat1[0].length;
       
          if(n==0 || m==0){
            System.out.println("matrix is empty");
            return ;          }
        //Scalar Addition
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=mat[i][j]+a;
            }
        }    
        System.out.println("Scalar Addition \n");
        System.out.println(Arrays.deepToString(mat));
          System.out.println();
         //Scalar Multiplication
         for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat1[i][j]=mat1[i][j]*b;
            }
        }
          System.out.println("Scalar Multiplication \n");
        System.out.println(Arrays.deepToString(mat1));
    }
    
}
