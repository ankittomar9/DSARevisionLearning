package DSARevisionLearning.arrays;

public class Q_44_Subarray_MaxSum_Average_SW {
    public static void main(String args[]){
        int arr[]={1,12,-5,-6,50,3};int n=arr.length; int k=4;
        if(n==0){ System.out.println("Empty Array");return ;}
        double currentSum=0;
        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        double maxSum=currentSum;
         
        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];
            maxSum=Math.max(currentSum, maxSum);
        }
        System.out.println("Maximum Subarray Sum of k window :\n"+maxSum);

        double average=maxSum/k;
          System.out.println("Maximum Subarray average of k window: \n "+average);
    }   
    
}
