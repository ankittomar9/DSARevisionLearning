package DSARevisionLearning.arrays;

public class Q_42_Subarray_Sum_optimized_best {
    public static void main(String args[]){
          int[] arr = {-2, -3, -1, -5, -4};
        if(arr.length==0){
            System.out.println("Empty Subarray sum doesn't exists");
            return;
        }
        int currentSum=arr[0]; 
        int maxSum=arr[0];
        int start=0; int end=0;int tempStart=0;

        for(int i=1;i<arr.length;i++){
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
