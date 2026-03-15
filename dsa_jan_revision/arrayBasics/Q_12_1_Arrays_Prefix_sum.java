package dsa_jan_revision.arrayBasics;

import java.util.Arrays;

public class Q_12_1_Arrays_Prefix_sum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
          System.out.println("Original Array \n"+Arrays.toString(arr));


        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println("Prefix Array Inplace \n"+Arrays.toString(arr));
    }
}


/* TC: is O(n) 
    SC : O(1) but original input is gone destructive
*/