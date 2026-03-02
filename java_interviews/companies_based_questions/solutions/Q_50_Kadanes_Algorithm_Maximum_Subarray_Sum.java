package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_50_Kadanes_Algorithm_Maximum_Subarray_Sum {
    public static void main(String args[]){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
         System.out.print( "Original Array \n"+Arrays.toString(arr));
        int max=findMaxSubarraySum(arr);
        System.out.println("\nMaximum Subarray Sum is: \n" + max);
        }
    public static int findMaxSubarraySum(int arr[]){
        if(arr==null || arr.length ==0) return 0;

        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

            if(currentSum>maxSum){
                maxSum=currentSum;
            }

            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
