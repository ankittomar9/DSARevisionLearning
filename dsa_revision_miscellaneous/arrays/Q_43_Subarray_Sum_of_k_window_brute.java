package dsa_revision_miscellaneous.arrays;

public class Q_43_Subarray_Sum_of_k_window_brute {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int n=arr.length; int k=3; int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<=n-k;i++){
            currentSum=0;
            for(int j=i;j<i+k;j++){
                currentSum=currentSum+arr[j];
            }
            maxSum=Math.max(currentSum, maxSum);
        }

        System.out.println("maximum subarray of "+k+" size window");
         System.out.println(maxSum);
    }
    
}
