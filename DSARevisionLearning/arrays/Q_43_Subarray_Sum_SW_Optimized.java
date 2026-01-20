package DSARevisionLearning.arrays;
public class Q_43_Subarray_Sum_SW_Optimized {
    public static void main(String args[]){
        int arr[]= {2, 1, 5, 1, 3, 2};        int n=arr.length;    int k=3;
        if(n==0){        System.out.println("Array is Empty");  return;        }    
        //step 1: calculate the sum for 1st window
          int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        int maxSum=currentSum;
        //step 2 slide the window and add incoming and remove outgoing
        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];

            maxSum=Math.max(currentSum, maxSum);
        }
        System.out.println("maximum subarray sum of window k is \n:"+maxSum);
    }
    
}
