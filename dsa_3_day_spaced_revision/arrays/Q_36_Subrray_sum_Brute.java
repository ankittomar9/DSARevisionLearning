package dsa_3_day_spaced_revision.arrays;

public class Q_36_Subrray_sum_Brute {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println("Subarray sum ("+i+" "+j+") : "+sum);
            }
        }
    }
    
}
