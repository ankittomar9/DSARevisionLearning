package dsa_3_day_spaced_revision.arrays;

public class Q_44_maximum__subarray_sum_average {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};int k=3;int n=arr.length;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }

        double maxSum=currentSum;

        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];

            maxSum=Math.max(maxSum, currentSum);
        }
         System.out.println("maximum subarray sum of k length window : "+maxSum);
        
         double average=maxSum/k;

        System.out.println("maximum subarray sum average: "+average);
    }
    
}
