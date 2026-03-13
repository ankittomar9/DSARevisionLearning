package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_1_Rotate_Array_k_times_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
            System.out.println("Original Array : \n"+Arrays.toString(arr));
        int k=3; int n=arr.length;
        k=k%n;          int start=0;        int end=n-1;

        rotateHelper(arr,0,end);
         System.out.println("Rotated Array \n"+Arrays.toString(arr));
        rotateHelper(arr,start,k-1);
         System.out.println("Rotated Array \n"+Arrays.toString(arr));
        rotateHelper(arr,k,end);
         System.out.println("Rotated Array \n"+Arrays.toString(arr));

    }
    public static void rotateHelper(int arr[],int start,int end){
        if(arr.length==0){ System.out.println("Array is empty"); return ;}

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
