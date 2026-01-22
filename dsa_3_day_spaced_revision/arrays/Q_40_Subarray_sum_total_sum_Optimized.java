package dsa_3_day_spaced_revision.arrays;

public class Q_40_Subarray_sum_total_sum_Optimized {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int total_Sum=0;
        for(int i=0;i<arr.length;i++){
                int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];

                System.out.println("Subarray sum ("+i+" "+j+") : "+sum);
                total_Sum=total_Sum+sum;
            }
            
        }
         System.out.println(" All Subarray sum Total Sum : "+total_Sum);
    }
    
}
