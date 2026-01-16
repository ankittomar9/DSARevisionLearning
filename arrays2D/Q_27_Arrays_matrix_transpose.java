package DSARevisionLearning.arrays2D;

import java.util.Arrays;

public class Q_27_Arrays_matrix_transpose {
    public static void main(String args[]){
        int mat[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        //matrix transpose using extra space
        int n=mat.length;        int m=mat[0].length;
        int mat1[][]=new int[n][m];
        if(n==0 || m==0){
            System.out.println("Matrices are empty");
            return;
        }   

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               // mat[i][j]=mat[j][i];
               mat1[j][i]=mat[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(mat));
                System.out.println(Arrays.deepToString(mat1));
    }
    
}
