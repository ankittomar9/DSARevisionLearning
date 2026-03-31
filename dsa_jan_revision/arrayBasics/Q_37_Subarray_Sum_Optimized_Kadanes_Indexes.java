package dsa_jan_revision.arrayBasics;
public class Q_37_Subarray_Sum_Optimized_Kadanes_Indexes {
    public static void main(String args[]){
         int[] arr = {-2, -3, -1, -5, -4};
         //  int arr[]={-2,1,-3,4,-1,2,1,-5,4};
         findMaxSubarray(arr);
    }
    public static void findMaxSubarray(int arr[]){
          if(arr==null || arr.length==0){
            System.out.println("Empty Subarray sum doesn't exists");
            return;    }
            int maxSum=arr[0];            int currentSum=arr[0];

            int start=0;int end=0;int tempStart=0;
            for(int i=0;i<arr.length;i++){
                if(currentSum+arr[i]>arr[i]){
                    currentSum=currentSum+arr[i];
                }else{
                    currentSum=arr[i];
                    tempStart=i;
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    start=tempStart;
                    end=i;
           }
            }
             System.out.println("Maximum Subarray sum is : "+maxSum);
            System.out.println("Subarray is ( "+start+","+end+" )");
    }
}
