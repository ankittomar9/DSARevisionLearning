package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_43_Find_a_Missing_Number_In_a_Array {
    public static void main(String args[]){
        int arr[]={1,2,4,5,6};
        System.out.println("Array: \n" + Arrays.toString(arr));
        int missing = findMissing(arr);
        System.out.println("The missing number is: \n" + missing);
    }
    public static int findMissing(int[] arr){
            if(arr==null || arr.length==0)return 1;
            long n=arr.length+1;

            long expectedSum=(n*(n+1))/2;

            long actualSum=0;

            for(int i=0;i<arr.length;i++){
                actualSum=actualSum+arr[i];
            }
            long result=expectedSum-actualSum;
            return (int)result;
        }
    
}
