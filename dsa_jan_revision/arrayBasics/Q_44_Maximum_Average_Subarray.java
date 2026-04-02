package dsa_jan_revision.arrayBasics;
public class Q_44_Maximum_Average_Subarray {
public static void main(String args[]){
        int arr[]={1,12,-5,-6,50,3};
    int k=4;
    maxSubarraySumAverageHelper(arr,k);
}
public static void maxSubarraySumAverageHelper(int arr[],int k){
    int n=arr.length;
    if(n==0 || n<k){    System.out.println("-1"); return;   }

    int currentSum=0;   

    for(int i=0;i<k;i++){
        currentSum=currentSum+arr[i];
    }
    double maxSum=Integer.MIN_VALUE;

    for(int i=k;i<n;i++){
        currentSum=currentSum+arr[i]-arr[i-k];
    
        if(currentSum>maxSum){
            maxSum=currentSum;
        }
    }
          System.out.println("Maximum Subarray Sum is : "+maxSum);
        double average=maxSum/k;
        System.out.println("Maximum Average is : "+average);
    }
}

