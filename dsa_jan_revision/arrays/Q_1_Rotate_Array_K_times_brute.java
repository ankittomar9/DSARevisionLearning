package dsa_jan_revision.arrays;

import java.util.Arrays;

public class Q_1_Rotate_Array_K_times_brute{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5}; int n=arr.length;
          System.out.println("Original Array "+Arrays.toString(arr));
        //Rotate Array k times to right if k=2 then output is 4 5 1 2 3
        int k=2;        k=k%n;
        rotateHelper(arr,k);       
    }
    public static void rotateHelper(int arr[],int k){
        int n=arr.length;
       
        for(int rot=0;rot<k;rot++){
             int last=arr[n-1];
       
             for(int i=n-2;i>=0;i--){
      
                arr[i+1]=arr[i];
      
        }
        arr[0]=last;
     }
    
        System.out.println("Rotated Array Brute"+Arrays.toString(arr));
    }
    
}
