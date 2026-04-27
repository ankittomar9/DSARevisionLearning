package dsa_jan_revision.arrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_59_Arrays_N_By_3_Repeat_Number {
    public static void main(String args[]){
        int arr1[]={1,1,1,3,3,2,2,2}; System.out.println(" Array 1: \n"  + Arrays.toString(arr1));
        System.out.println("Result: " + majorityElement(arr1) + "\n");
         int arr2[]={1,2,3,4,5}; System.out.println("Edge Case: Array: " + Arrays.toString(arr2));
        System.out.println("Result: " + majorityElement(arr2));
    }
    public static List<Integer> majorityElement(int nums[]){
        List<Integer> result=new ArrayList<>();
        if(nums==null || nums.length==0){ return result;}
        int candidate1=Integer.MIN_VALUE;int candidate2=Integer.MIN_VALUE;
        int count1=0;int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){count1++;}
            else if(nums[i]==candidate2){count2++;}
            else if(count1==0){candidate1=nums[i];count1=1;}
            else if(count2==0){candidate2=nums[i]; count2=1;}
            else{count1--;count2--;}
        }
        count1=0; count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){count1++;}
       else if(nums[i]==candidate2){count2++;}
        }
        int threshold=nums.length/3;
        if(count1>threshold){result.add(candidate1);}
        if(count2>threshold){result.add(candidate1);}
        return result;
    }
}
