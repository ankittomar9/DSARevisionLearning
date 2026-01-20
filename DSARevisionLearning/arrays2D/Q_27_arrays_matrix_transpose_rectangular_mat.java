package DSARevisionLearning.arrays2D;

import java.util.Arrays;

public class Q_27_arrays_matrix_transpose_rectangular_mat {
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
         int n=matrix.length;
         int m=matrix[0].length;

        int matrix1[][]=new int[m][n]; // important for dimensions change
    
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[j][i]=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix1));
    }
    
}
