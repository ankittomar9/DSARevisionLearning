package dsa_jan_revision.arrays;

import java.util.Arrays;

public class Q_1_Rotate_Array_K_time_Optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array "+Arrays.toString(arr));
        int k=2; int n=arr.length;
        
        k=k%n;
        int start=0; int end=n-1;
           RotateHelper(arr,start,end);
          RotateHelper(arr,start,k-1);
           RotateHelper(arr,k,end);
         System.out.println("\nRotated Array Final \n"+Arrays.toString(arr));
        
    }
    public static void RotateHelper(int arr[],int start,int end){
        int i=start; int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println("\nRotated Array \n"+Arrays.toString(arr));
    }
    
}
