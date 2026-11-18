package dsa_june_revision.arrays;

import java.util.Arrays;

public class Q_5_Linear_Search_With_Index {
    public static void main(String args[]){
        int arr[]={1,4,6,3,2,7,1,2,5}; int target=2;
        //since two is repeating we will take the last location of the occurence
        // if you want all the occurence then use ArrayList or Array to store the occurences indexes
        System.out.println(("Original Array : \n"+Arrays.toString(arr)));
        linearSearchHelper(arr, target);
    }
    public static void linearSearchHelper(int[] arr,int target){
        if(arr==null || arr.length<1){
            System.out.println("Array is empty or null");
            return; 
        }
        int index=0; boolean isFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
            isFound=true;
        }
        if(isFound){
            System.out.println("target exists at index : "+index);
        }else{
               System.out.println("target doesn't exists at index");
        }

       
    }
}
