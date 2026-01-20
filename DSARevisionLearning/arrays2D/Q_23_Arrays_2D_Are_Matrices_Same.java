package DSARevisionLearning.arrays2D;

public class Q_23_Arrays_2D_Are_Matrices_Same {
    public static void main(String args[]){
        int mat1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int mat2[][]={{1,2,3,4},{5,6,6,8},{9,10,11,12}};
      //   int mat2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //To check if matrices are same or not 
        //there dimensions should be same and mat1[i][j]=mat2[i][j]
        int n=mat1.length;
        int m=mat1[0].length;
        boolean isSame=true;
        if(n==0 || m==0){
            System.out.println("matrices are empty");
            return;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    isSame=false; break;
                }
            }
        }
        if(isSame){
             System.out.println("matrices are same");
        }else{
            System.out.println("matrices are different");
        }
    }
  
}
