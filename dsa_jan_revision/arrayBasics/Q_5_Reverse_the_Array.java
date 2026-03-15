package dsa_jan_revision.arrayBasics;

import java.util.Arrays;

public class Q_5_Reverse_the_Array {
    public static void main(String args[]){
        int arr[]={1,2,5,7,8,12,15,19,20};
          System.out.println("Original Array \n"+Arrays.toString(arr));
        reverseHelper(arr);
         System.out.println("Reversed Array \n"+Arrays.toString(arr));
    }
    public static void reverseHelper(int arr[]){
            if(arr==null || arr.length==0){System.out.println("Empty Array ");return;}
        int i=0;int j=arr.length-1;
    
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}
