package dsa_jan_revision.arrayBasics;

public class Q_45_Minimum_Subarray_Sum {
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
        int minSum=Integer.MAX_VALUE;
        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];
        
            if(currentSum<minSum){
                minSum=currentSum;
            }
        }
         System.out.println("Minimum Subarray Sum is : "+minSum);
    

    }
}
