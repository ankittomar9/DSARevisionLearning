package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_7_Single_number {
    public static void main(String[] args) {
          /* A ^ A = 0
            A ^ 0|1 = A            */
 /*Given an array of integers where every element appears twice except for one.
         Find that single one. */
         /* Approach 1: Use HashMap or Frequency Array
            Approach 2 : Sort and Comapare Adjacent Array 
          */  
        int arr1[]={4,1,2,1,2};
        System.out.println("Original Array : \n"+Arrays.toString(arr1));
        singleNumberHelper(arr1);

        int arr2[]={4,5,6,5,6,4,1,3,6,3,6};
        System.out.println("Original Array : \n"+Arrays.toString(arr2));
        singleNumberHelper(arr2); 
    }
    public static void singleNumberHelper(int arr[]){
        if(arr==null || arr.length==0){
            System.out.print("Null or Empty array");return;}
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println("Unique number is : "+result);
    }
}
