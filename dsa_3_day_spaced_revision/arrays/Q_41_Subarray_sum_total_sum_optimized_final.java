package dsa_3_day_spaced_revision.arrays;

public class Q_41_Subarray_sum_total_sum_optimized_final {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
            int n=arr.length;
        long totalSum=0;
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        //   System.out.println(sum);

        // Contribution is calculcated by (i+1)(n-i)
        for(int i=0;i<arr.length;i++){
            long frequency=(long)(i+1)*(n-i);
           totalSum =totalSum + (arr[i] * frequency);
        }

        System.out.println(totalSum);
    }
    
}
