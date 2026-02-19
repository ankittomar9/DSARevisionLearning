package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_32_Arrays_Duplicate_Remove_from_Sorted_Array{
    public static void main(String args[]){
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
         System.out.print( "Original Array \n"+Arrays.toString(arr));
        
          System.out.print( " \nModified Array \n");
        int newLength= removeDuplicates(arr);
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr){
        if(arr==null || arr.length==0){return 0;}
        int j=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j + 1; //length of unique element
    }
}
