package dsa_jan_revision.arrayBasics;

import java.util.Arrays;

public class Q_12_Arrays_Prefix_sum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array \n"+Arrays.toString(arr));
        prefixHelper(arr);

    }
    public static void prefixHelper(int arr[]){
        int prefixArr[]=new int[arr.length];

            prefixArr[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                prefixArr[i]=prefixArr[i-1]+arr[i];
            }
            System.out.println("Prefix Array \n"+Arrays.toString(prefixArr));
    }
}
