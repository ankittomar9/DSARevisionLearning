package dsa_3_day_spaced_revision.arrays;

public class Q_45_Minimum_Length_Subarray_sum {
    public static void main(String args[]){
        int arr[]={2,3,1,2,4,3}; int target=7;
        int n=arr.length; int currentSum=0; int minLength=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<arr.length;right++){
            currentSum=currentSum+arr[right];

            while(currentSum>=target){
                int newMinLength=right-left+1;
                  minLength=Math.min(minLength, newMinLength);
                  
                currentSum=currentSum-arr[left];
                left++;
            }
            
        }

        if(minLength==Integer.MAX_VALUE){
            System.out.println("0");
        }else{
            System.out.println("minimum length subarray maxSum : "+minLength);
        }
        
    }
    
}
