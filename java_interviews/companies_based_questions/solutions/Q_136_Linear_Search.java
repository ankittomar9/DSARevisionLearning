package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_136_Linear_Search {
    public static void main(String args[]){
        int arr[]={4,2,8,5,1,9};  System.out.println("Original Array "+Arrays.toString(arr));
        int target=5;
         System.out.println("Linear Search  for target "+target);
        int result=linearSearchhelper(arr, target);
        if(result==0){
            System.out.println("Target not exists");
        }else{
              System.out.println("Target  exists at index : "+result);
        }
    }
    public static int linearSearchhelper(int arr[],int target){
        if(arr==null || arr.length==0){System.out.println("Array is null or empty");return -1;}

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return 0;
    }
}
