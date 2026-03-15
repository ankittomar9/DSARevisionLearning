package dsa_jan_revision.arrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_10_1_Separate_Odd_Even_In_Array {
    public static void main(String args[]){
        int arr[]={2,1,4,6,3,10,12,7,5,9,13,15,14,-2,-1,-21};
         System.out.println("Original Array \n"+Arrays.toString(arr));
         evenOddSeparateHelper(arr);
        
    }
    public static void evenOddSeparateHelper(int arr[]){
        if(arr==null || arr.length==0){System.out.println("Empty Array or null");return;}
        List<Integer>evenList=new ArrayList<>();
        List<Integer>oddList=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==0 ){ // arr[i]%2 ==0 this can be used but this is okay
                evenList.add(arr[i]);
            }else if ((arr[i] & 1)!=0){
                   oddList.add(arr[i]);
            }
        }
        System.out.println("Even Elements are \n"+evenList);
         System.out.println("Odd Elements are \n"+oddList);
   
    }
        
    
}
