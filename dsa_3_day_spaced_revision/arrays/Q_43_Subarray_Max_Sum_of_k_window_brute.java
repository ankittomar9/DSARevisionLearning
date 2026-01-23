package dsa_3_day_spaced_revision.arrays;

public class Q_43_Subarray_Max_Sum_of_k_window_brute{
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int k=3; int n=arr.length;
        int currentSum=0; int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            currentSum=0;
            for(int j=i;j<i+k;j++){
                    currentSum=currentSum+arr[j];
                   
            }
             if(currentSum>maxSum){
                        maxSum=currentSum;
            }
            System.out.println("Window length : ( "+i+","+(i+k-1)+" ) : "+currentSum);
        }
        
        System.out.println("maximum subarray sum of k length window : "+maxSum);
    
    }
    
}
