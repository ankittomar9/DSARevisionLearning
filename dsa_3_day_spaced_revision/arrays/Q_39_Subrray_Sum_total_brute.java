package dsa_3_day_spaced_revision.arrays;

public class Q_39_Subrray_Sum_total_brute {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int total_Sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    
                }
                total_Sum=total_Sum+sum;
              System.out.println("Subarray sum ("+i+" "+j+") : "+sum);
            }
        }
        
          System.out.println(" All Subarray sum Total Sum : "+total_Sum);
    }
    
}
