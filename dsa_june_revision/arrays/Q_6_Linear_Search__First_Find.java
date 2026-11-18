package dsa_june_revision.arrays;

import java.util.Arrays;

public class Q_6_Linear_Search__First_Find {
    public static void main(String[] args) {
        int[] arr={41,2,14,5,6,8,4,9,1,2,3,6,7}; int target=9;
        System.out.println("Original Array \n"+Arrays.toString(arr)+"\n Target : "+target);
        linearSearchHelper(arr,target);

    }
    public static void linearSearchHelper(int[] arr,int target){
        if(arr==null || arr.length<1){
            System.out.println("Array is empty or null");return ;}
            boolean isFound=false; int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                isFound=true;
                    index=i;
                    break;
                }
            }

           if(isFound){
             System.out.println("Target exists at index : "+index);
           }else{
             System.out.println("Target doesn't exists ");
           }
    }
}
