package dsaJuly.dsajuly.arrays;

import java.util.Arrays;

public class Q_1_Rotate_array_k_times_optimized {
 public static void main(String[] args) {
     int arr[]={1,2,3,4,5};int k=3;// k= number of rotations array needs to do
     System.out.println("Original Array \n"+Arrays.toString(arr));
        int n=arr.length;
        k=k%n; // normalize the rotations 
        if(k==0){
            System.out.println("No  Rotation required");
        }
          rotateHelper(arr, 0, n-1);
            rotateHelper(arr, 0, k-1);
            rotateHelper(arr, k, n-1);
          
             System.out.println("Array After rotation \n"+Arrays.toString(arr));
 }   

 public static void rotateHelper(int[] arr,int start,int end){
    if(arr==null || arr.length==0){  System.out.println("Array is null or Empty"); return;}

    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }   

 }
}
