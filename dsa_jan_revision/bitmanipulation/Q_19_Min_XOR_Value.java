package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_19_Min_XOR_Value {
    public static void main(String[] args) {
        int arr1[] = {0,4,7,9}; System.out.println("Original Array: " + Arrays.toString(arr1));
      System.out.println("Minimum XOR Value: " + solve(arr1));

        int arr2[] = {9,5,3,14}; System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Minimum XOR Value: " + solve(arr2));
        
    }
    public static int solve(int arr[]){
          if(arr==null || arr.length==0){ System.out.println("Empty or null Array :");return  0;}
        Arrays.sort(arr);
        int minXor = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int currentXor =arr[i] ^ arr[i+1];

            if(currentXor <minXor){
                minXor=currentXor;
            }
        }
        return minXor;
    }
}
