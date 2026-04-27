package dsa_jan_revision.arrayBasics;

import java.util.Arrays;

public class Q_62_Multiple_left_rotation_Array {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; 
         System.out.println("Original Array: \n"+Arrays.toString(arr));
        int B[]={2,3,14};   System.out.println("Original Array: \n"+Arrays.toString(B));
         int[][] result = solve(arr, B);
        System.out.println("Final Result Matrix:");
        for (int i=0; i<result.length; i++) {
            System.out.println("Rotation " + B[i] + ": " + Arrays.toString(result[i]));
        }
      
     }
     public static int[][] solve(int arr[],int B[]){
        int n=arr.length; int m=B.length; 
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++){
            int tempArr[]= new int[n];
            for(int j=0;j<n;j++){
                tempArr[j]=arr[j];
            }
            int k=B[i]%n;
            rotateHelper(tempArr, 0, k-1);
            rotateHelper(tempArr, k, n-1);
            rotateHelper(tempArr, 0, n-1);
            res[i]=tempArr;
        }
        return res;
     }
     public static void rotateHelper(int arr[],int start,int end){
        if(arr==null || arr.length==0){ return;}
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
     }

}
