package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_38_Rotate_Array_by_K_Positions_right {
    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5, 6, 7}; int k=3;
        //expected output 5, 6, 7, 1, 2, 3, 4
         int n=arr.length; int start=0; int end=n-1;
         k=k%n;
            reverseHelper(arr,start,end);
             System.out.println("Array Rotated "+Arrays.toString(arr));
             reverseHelper(arr,0,k-1);
             System.out.println("Array Rotated "+Arrays.toString(arr));
              reverseHelper(arr,k,n-1);
                 System.out.println("Array Rotated Final"+Arrays.toString(arr));
    }
    public static void reverseHelper(int arr[],int start,int end){
        if (arr == null || arr.length <= 1) return;  
        int i=start; int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    
}
