package dsa_revision_miscellaneous.arrays;
public class Q_44_Subarray_Sum_of_k_window_average {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int n=arr.length;int k=3;int currentSum=0;

        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        double maxSum=currentSum;
        //
        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];

            maxSum=Math.max(currentSum, maxSum);
        }
        double average=maxSum/k;

        if(n==0){
             System.out.println("Empty array");
        }else{
            
         System.out.println("maximum subarray of "+k+" size window");
         System.out.println(maxSum);
         System.out.println("maximum subarray average");
            System.out.println(average);
        }
        

    }

    
}
