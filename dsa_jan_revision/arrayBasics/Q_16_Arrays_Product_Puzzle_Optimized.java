package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_16_Arrays_Product_Puzzle_Optimized {
 //the Problem: Given an array nums of size n,
 //  return an array res such that res[i] is equal to the product of all the elements of nums except nums[i].
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        productPuzzleHelper(arr);
    }
    public static void productPuzzleHelper(int arr[]){
        int n=arr.length;
        int left_prod_Arr[]=new int[n];
        int right_prod_Arr[]=new int[n];
        int resultArr[]=new int[n];
        
        left_prod_Arr[0]=1;
        for(int i=1;i<n;i++){
            left_prod_Arr[i]=left_prod_Arr[i-1]*arr[i-1];
        }
         System.out.println("Left Product Array:  \n" + Arrays.toString(left_prod_Arr));
        right_prod_Arr[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right_prod_Arr[i]=right_prod_Arr[i+1]*arr[i+1];
        }
        System.out.println("Right Product Array:  \n" + Arrays.toString(right_prod_Arr));

         for(int i=0;i<n;i++){
          resultArr[i]= left_prod_Arr[i] *  right_prod_Arr[i];
        }
        System.out.println("Final Result: \n" + Arrays.toString(resultArr));
    }
}
