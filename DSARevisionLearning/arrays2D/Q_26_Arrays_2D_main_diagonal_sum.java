package DSARevisionLearning.arrays2D;
public class Q_26_Arrays_2D_main_diagonal_sum {
    public static void main(String args[]){
        int mat[][]={{9,8,7},
                     {6,5,4},
                     {3,2,1}};

        //Main Diagonal Sum for Square matrix
        //Since i==j
        int n=mat.length;
        int m=mat[0].length;
          if(n==0 || m==0){
            System.out.println("matrix is empty");
            return ;
          }
        int sum=0;
        for(int i=0;i<n;i++){

            sum=sum+mat[i][i];
        }
        System.out.println("Sum of main diagonal is "+sum);
    }
    
}
