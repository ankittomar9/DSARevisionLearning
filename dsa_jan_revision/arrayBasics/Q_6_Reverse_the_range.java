package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_6_Reverse_the_range {
    public static void main(String args[]){
           int arr[]={1,2,5,7,8,12,15,19,20};
           int start=2; int end=6;
            System.out.println("Original Array \n"+Arrays.toString(arr));
            reverseHelper(arr,start,end);
            System.out.println("Modified Array \n"+Arrays.toString(arr));

    }
    public static void reverseHelper(int arr[],int start,int end){
       if(arr==null || arr.length==0){  System.out.println("Array is Empty"); return;} 
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
}
