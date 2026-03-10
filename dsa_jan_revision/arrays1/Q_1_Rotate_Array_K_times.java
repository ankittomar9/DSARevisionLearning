package dsa_jan_revision.arrays1;

import java.util.Arrays;

public class Q_1_Rotate_Array_K_times {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=3; int n=arr.length;
        k=k%n;
        int start=0; int end=n-1;
        reversehelper(arr,0,end);
        reversehelper(arr,0,k-1);
         reversehelper(arr,k,end);
          

    }
    public static void reversehelper(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        System.out.println(""+Arrays.toString(arr));
    }
}
