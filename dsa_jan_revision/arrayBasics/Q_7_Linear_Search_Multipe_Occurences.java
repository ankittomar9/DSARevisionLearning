package dsa_jan_revision.arrayBasics;
import java.util.ArrayList;
import java.util.List;
public class Q_7_Linear_Search_Multipe_Occurences { 
    /*Q2. Linear Search - Multiple Occurences
    Given an array A and an integer B, find the number of occurrences of B in A. */
    public static void main(String args[]){
        int arr[]={10,99,12,3,4,3,66,3,2,3};
        int target=3;
        linearSearchHelper(arr,target);
    }

    public static void linearSearchHelper(int arr[],int target){
          if(arr==null || arr.length==0){  System.out.println("Array is Empty"); return;} 
        List<Integer> list=new ArrayList<>();
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                list.add(i);
                count++;
            }
        }
        System.out.println("Target Exists in Array");
         System.out.println("Count of target in array ");
         System.out.println(count);
        System.out.println("Target Indexes in Array are");
        System.out.println(list);
    }
}
