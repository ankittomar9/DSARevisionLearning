package dsa_3_day_spaced_revision.arrays;

public class Q_43_Subarray_Max_Sum_of_k_window_optimized {
    public static void main(String args[]){ 
        int arr[]={2,1,5,1,3,2};int n=arr.length; int k=3;
        if(n==0){
            System.out.println("Array is empty"); return;        }
            int currentSum=0;
            for(int i=0;i<k;i++){
                currentSum=currentSum+arr[i];
            }

            int maxSum=currentSum;

            for(int i=k;i<n;i++){
                currentSum=currentSum+arr[i]-arr[i-k];

               maxSum=Math.max(currentSum, maxSum);
            }

             System.out.println("maximum subarray sum of k length window : "+maxSum);
    }
    
}
