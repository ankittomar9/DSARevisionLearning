package DSARevisionLearning.arrays2D;

import java.util.Arrays;

public class Q_27_Arrays_matrix_transpose_inplace {
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(mat));
        System.out.println();
        
    }
    
}
