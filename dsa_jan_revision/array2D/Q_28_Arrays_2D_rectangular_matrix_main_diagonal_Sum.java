package dsa_jan_revision.array2D;

public class Q_28_Arrays_2D_rectangular_matrix_main_diagonal_Sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        rectangularDiagonalSum(arr);
    }
    public static void rectangularDiagonalSum(int arr[][]){
        if(arr==null ||arr.length==0){return;}

        int n=arr.length;int m=arr[0].length;

        int limit=Math.min(n, m);
        long sum=0;
        for(int i=0;i<limit;i++){
            sum=sum+arr[i][i];
        }
        System.out.println("Sum of diagonal (rectangular) by limiting: \n" + sum);

    }
}
