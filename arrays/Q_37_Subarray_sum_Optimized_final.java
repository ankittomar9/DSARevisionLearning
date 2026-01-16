package DSARevisionLearning.arrays;

public class Q_37_Subarray_sum_Optimized_final {
    public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            int n=arr.length;

            for(int i=0;i<n;i++){
                   int sum=0;
                for(int j=i;j<n;j++){
                    sum=sum+arr[j];
                     System.out.println("Subarray ( "+i+","+j+" ) : "+sum);
                }
            }
    }
    
}
