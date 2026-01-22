package dsa_3_day_spaced_revision.arrays;

public class Q_38_Subarray_Sum_Optimized_final {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};

        for(int i=0;i<arr.length;i++){
                int sum=0;
            for(int j=i;j<arr.length;j++){
            
                sum=sum+arr[j];
                 System.out.println("Subarray sum ("+i+" "+j+") : "+sum);
            }
        }
    }
    
}
