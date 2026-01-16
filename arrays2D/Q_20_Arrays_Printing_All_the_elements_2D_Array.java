package DSARevisionLearning.arrays2D;

import java.util.Arrays;

public class Q_20_Arrays_Printing_All_the_elements_2D_Array {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Using Inbuilt Functions");
                System.out.println(Arrays.deepToString(arr));
                System.out.println();
                System.out.println();
                
        int n=arr.length;
        int m=arr[0].length;
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
    }
    
}
