package dsa_revision_miscellaneous.arrays;

public class Q_42_MaximumSubarray_Sum_optimized_final {
    public static void main(String args[]){
       // int arr[]={2,1,5,1,3,2};
         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length; int currentSum=arr[0];int maxSum=arr[0];
        int start=0;int end=0;int tempStart=0;
        
        for(int i=0;i<arr.length;i++){
           if(currentSum+arr[i]>arr[i]){
              currentSum=currentSum+arr[i];
           }else{
                currentSum=arr[i];
                tempStart=i;
           }
            maxSum=Math.max(currentSum, maxSum);
            start=tempStart;
            end=i;
        }
         System.out.println("maximum Subarray ("+start+","+end+") is : "+maxSum);

    }
    
}
