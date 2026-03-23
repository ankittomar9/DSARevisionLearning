package dsa_jan_revision.array2D;
public class Q_25_Minor_Diagonal_Sum {
    public static void main(String args[]){
         int arr[][]={ {1,2,3,4}, {5,6,7,8},{10,11,12,13},{14,15,16,17}};
                    minorDiagonalSumCalculator(arr);
    }
    public static void minorDiagonalSumCalculator(int arr[][]){
        if(arr==null ||arr.length==0){return;}
        int n=arr.length; int m=arr[0].length;
           //Using Single while Loop         //See dimensions of minor diagonal
        //(0 ,m-1),(n,m),(n-1,0)  (0,2),(1,1),(1,0)
        //Using two Loops
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==n-1){
                    sum=sum+arr[i][j];
                }
            }
        }
         System.out.println("Sum of Minor Diagonal : \n"+sum);
         //Using single loop
            long sum1=0;
         for(int j=0;j<n;j++){
            sum1=sum1+arr[j][n-1-j];
         }
           System.out.println("Sum of Minor Diagonal : \n"+sum1);
    
           //Using single loop while loop 
           int a=0;int b=m-1; long sum2=0;
           while(b>=0){
                sum2=sum2+arr[a][b];
            a++;
            b--;
           }
            System.out.println("Sum of Minor Diagonal : \n"+sum2);
        }
    }


