package dsa_jan_revision.array2D;
import java.util.Arrays;
public class Q_29_Arrays_2D_Anti_Diagonals {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=getAntiDiagonals(arr);
        System.out.println("Anti-Diagonals matrix : ");
        for(int i=0;i<result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
    public static int[][] getAntiDiagonals(int arr[][]){
        if(arr==null || arr.length==0){ return  new int[0][0];}
        int n=arr.length;

        int result[][]=new int[2*n-1][n];
        int rowRes=0;
        for(int c=0;c<n;c++){
            int startRow=0;int startCol=c;
            int colRes=0;
            while(startRow<n &&  startCol>=0){
                result[rowRes][colRes]=arr[startRow][startCol];
                startRow++;
                startCol--;
                colRes++;
            }
            rowRes++;
        } 
        for(int r=1;r<n;r++){
            int startRow=r;int startCol=n-1;
            int colRes=0;
            while(startRow<n &&  startCol>=0){
                result[rowRes][colRes]=arr[startRow][startCol];
                startRow++;
                startCol--;
                colRes++;
            }
            rowRes++;
        } 
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(result));
        return result;    

    }
}
