package dsa_jan_revision.arrayBasics;

public class Q_43_Subarray_Sum_for_k_window_brute {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int k=3; int n=arr.length;

        subarraySumKwindowHelper(arr,k);
    }
    public static void subarraySumKwindowHelper(int arr[],int k){
        if(arr==null  || arr.length==0 || k==0 ){return;}
        int n=arr.length;

         int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int currentSum=0; 
            for(int j=i;j<=k;j++){
                currentSum=currentSum+arr[j];
            }
            maxSum=Math.max(currentSum, maxSum);
        }
         System.out.println("Maximum Subarray sum of k window : \n"+maxSum);

    }
}
