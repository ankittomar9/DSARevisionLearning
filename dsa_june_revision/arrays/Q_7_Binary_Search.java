package dsa_june_revision.arrays;

import java.util.Arrays;

public class Q_7_Binary_Search {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,8,10,11,13,15,16,18,20,21,23,26,29,30};
        int target=26; System.out.println("Original Array \n"+Arrays.toString(arr)+"\n Target : "+target);
        binarySearchHelper(arr, target);
    }
   public static void binarySearchHelper(int[] arr,int target){
    if(arr==null || arr.length==0){
        System.out.println("Array is empty or null");
        return;
    }
    int left=0; int right=arr.length-1; boolean isFound=false;
   
    while(left<=right){
         int mid=left+ (right-left)/2; 
        if(arr[mid]==target){
            System.out.println("Target exists at index : "+mid);
            isFound=true;
            break;
        }
        else if(arr[mid]>target){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }

   }
}
