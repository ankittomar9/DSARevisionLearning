package dsa_jan_revision.arrayBasics;

public class Q_43_Subarray_Maximum_Sum_SW_Optimized {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2}; 
        int k=3;
        subarrraySumHelper(arr,k);

    }
    public static void subarrraySumHelper(int arr[],int k){
        int n=arr.length;
        if(arr==null || arr.length==0 || n<k){  System.out.println("-1"); return;      }

        int currentSum=0;

        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];

            if(currentSum >maxSum){
                maxSum=currentSum;
            }
        }
          System.out.println("Maximum Sum (Optimized): " + maxSum);
    }
}
