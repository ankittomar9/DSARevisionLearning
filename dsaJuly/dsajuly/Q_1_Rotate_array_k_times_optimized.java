package dsaJuly.dsajuly;

import java.util.Arrays;

public class Q_1_Rotate_array_k_times_optimized {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5}; int k=3;
      System.out.println(" Original Array \n"+Arrays.toString(arr));
      int n=arr.length;
      k=k%n;
      int start=0; int end=n-1;
      reverseHelper(arr, start, end);
      reverseHelper(arr, start, k-1);
      reverseHelper(arr, k, end);
       System.out.println("Array after  "+k+" rotations \n"+Arrays.toString(arr));
    }

    public static void reverseHelper(int[] nums,int start,int end){
        if(nums==null || nums.length==0){System.out.println("Array is empty or null");
            return ;
        }
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }    

    }
}
