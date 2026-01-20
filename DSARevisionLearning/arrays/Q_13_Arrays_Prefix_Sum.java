package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_13_Arrays_Prefix_Sum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
           System.out.println("Original Array \n"+Arrays.toString(arr));
        //Extra space prefix sum

        if (arr.length == 0) {
            System.out.println("Empty array");
            return;
            }
            
        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        System.out.println("Prefix Array \n"+Arrays.toString(prefix_arr));
        //Inplace
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
         System.out.println("Prefix Original Array Modified \n"+Arrays.toString(arr));

    }
    
}
