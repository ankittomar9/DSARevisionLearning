package DSARevisionLearning.arrays2D;

public class Q_29_Arrays_Minor_Diagonal_Sum {
    public static void main(String args[]){
        int mat[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
         //what we  need is sum of anti diagonal 3+5+7
        int n=mat.length;int m=mat[0].length;
        if(n==0 || m==0){
            System.out.println("matrix is empty");return; }
       //Diagonal Coordinates are  for 3x3 matrix (0,2),(1,1),(2,0)
       //Approach 1 :
       int sum=0;
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==n-1){
                    sum=sum+mat[i][j];
                }
              //  System.out.println("Subarray: ("+i+","+j+") :" +sum);
            }
       }     
       System.out.println("Approach 1  SUM :"+sum);

       int newSum=0;
       for(int i=0;i<n;i++){
        newSum=newSum+mat[i][n-1-i]; // i+j=n-1 so j=n-1-i
       }
        System.out.println("Approach 2 Sum : "+newSum);
    }
    
}
