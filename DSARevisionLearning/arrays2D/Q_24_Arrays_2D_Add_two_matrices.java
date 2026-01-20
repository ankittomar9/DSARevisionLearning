package DSARevisionLearning.arrays2D;

import java.util.Arrays;

public class Q_24_Arrays_2D_Add_two_matrices {
    public static void main(String args[]){
        int mat1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int mat2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        int n=mat1.length;
        int m=mat1[0].length;
        if(n==0 || m==0){
            System.out.println("matrices are empty");
            return;
        }

        int resultant_mat[][]=new int[n][m];
         
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                resultant_mat[i][j]=mat1[i][j]+mat2[i][j];
            }

        
        }
        System.out.println("Added matrices are \n");
        System.out.println(Arrays.deepToString(resultant_mat));
    }
    
}
