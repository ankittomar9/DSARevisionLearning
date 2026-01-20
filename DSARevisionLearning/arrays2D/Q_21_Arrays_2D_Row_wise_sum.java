package DSARevisionLearning.arrays2D;

public class Q_21_Arrays_2D_Row_wise_sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int n=arr.length;
        int m=arr[0].length;
        if(n==0 || m==0){
            System.out.println("Empty Matrix");
            return;
        }

        for(int i=0;i<n;i++){
            int  sum=0;
            for(int j=0;j<m;j++){
                sum=sum+arr[i][j];
            }

            System.out.println("Sum of Row "+i+" is : "+sum);
        }

    }
    
}
