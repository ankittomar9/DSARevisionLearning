package dsa_june_revision.arrays;

import java.util.Arrays;

public class Q_1_Rotate_array_k_times_optimized {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        rotateHelper(arr,k);
    }
    public static void rotateHelper(int[] arr,int k ){
        if(arr==null || arr.length==0){return;}
        int n=arr.length-1;
        k=k%arr.length;
        reverseHelper(arr, 0, n);
        System.out.println("Array Rotation  : "+Arrays.toString(arr));
        
        reverseHelper(arr, 0, k-1);
        System.out.println("Array Rotation : "+Arrays.toString(arr));
        
        reverseHelper(arr, k, n);
        System.out.println("Array Rotation Final : "+Arrays.toString(arr));

    }
    public static void reverseHelper(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
    }
}



