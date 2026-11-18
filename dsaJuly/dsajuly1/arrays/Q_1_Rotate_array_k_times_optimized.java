package dsaJuly.dsajuly1.arrays;

import java.util.Arrays;

public class Q_1_Rotate_array_k_times_optimized {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; int k=3;
        int n=arr.length;
        System.out.println("Original Array \n"+Arrays.toString(arr));
        k=k%n;
        rotateHelper(arr, 0, n-1);
        rotateHelper(arr, 0,k-1 );
        rotateHelper(arr, k, n-1);
           System.out.println("Array after "+k+" rotation  \n"+Arrays.toString(arr));
    }
    public static void rotateHelper(int[] arr,int start,int end){
        if(arr==null ||arr.length==0){
            System.out.println("Array is Empty or null");
            return ;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }

    }

}
