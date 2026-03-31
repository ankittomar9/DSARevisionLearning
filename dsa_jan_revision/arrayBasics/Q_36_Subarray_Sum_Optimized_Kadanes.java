package dsa_jan_revision.arrayBasics;

public class Q_36_Subarray_Sum_Optimized_Kadanes {
    public static void main(String args[]){
         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
         long maxSum=findMaxSubarraySum(arr);
         System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static long findMaxSubarraySum(int arr[]){
        if(arr==null || arr.length==0)return 0;

        
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

           if(currentSum > maxSum){
            maxSum=currentSum;
           }
           if(currentSum<0){
            currentSum=0;
           }
        }
        return maxSum;
    }
}
