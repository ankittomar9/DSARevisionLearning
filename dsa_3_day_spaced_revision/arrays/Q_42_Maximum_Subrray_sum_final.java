package dsa_3_day_spaced_revision.arrays;

public class Q_42_Maximum_Subrray_sum_final {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int currentSum=0; int maxSum=Integer.MIN_VALUE;
        int start=0;int tempStart=0; int end=0;
        for(int i=0;i<arr.length;i++){
            if(currentSum+arr[i]>arr[i]){
                currentSum=currentSum+arr[i];
            }else{
                currentSum=arr[i];
                tempStart=0;
            }

            maxSum=Math.max(currentSum, maxSum);
            start=tempStart;
            end=i;
        }


        System.out.println("maximum Subarray ("+start+","+end+") is : "+maxSum);

    }
    
}
