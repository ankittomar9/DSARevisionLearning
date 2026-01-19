package DSARevisionLearning.arrays;

public class Q_43_Subarray_Sum_SW_brute {
    public static void main(String args[]){
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k=3;        int n=arr.length;
        if(n==0){        System.out.println("Array is Empty");  return;        }
        
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<=n-k;i++){
                int currentSum=0;
            for(int j=i;j<i+k;j++){
                currentSum=currentSum+arr[j];
            }

            maxSum=Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum Subarray sum of k window : \n"+maxSum);
      

    }
    
}
