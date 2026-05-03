package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_9_Interesting_array {
    public static void main(String[] args) {
          /*The Problem You are given an array of numbers. You can perform the following operation any number of times:
        Pick any element v from the array.
        Remove it        Add two new numbers a and b to the array such that a + b = v.
        Goal: Can you make the XOR of all elements in the array equal to 0?
        Return "Yes" or "No".      */
        int arr[]={9,17};System.out.println("Evaluating Array:" +Arrays.toString(arr));
        solve(arr);  
        int[] arr2 = {9, 17, 3}; System.out.println("Evaluating Array:" +Arrays.toString(arr2));
        solve(arr2);
    }
    public static void solve(int arr[]){
        if(arr==null || arr.length==0){System.out.println("Array is empty or null");return;}

        long result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
         // if(sum%2 ==0){ // other way to right the below code
         if((result & 1 )==0){
             System.out.println("Yes given array is interesting");
        }else{
             System.out.println("No given array is not interesting ");
        
        }
    }
}
