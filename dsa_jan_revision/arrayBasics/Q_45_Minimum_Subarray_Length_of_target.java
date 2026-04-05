package dsa_jan_revision.arrayBasics;
public class Q_45_Minimum_Subarray_Length_of_target {
    public static void main(String args[]){
     /*Problem: Given array of positive integers and target,
     find the minimum length of a contiguous subarray whose sum is >= target. Return 0 if none.
     Example: [2,3,1,2,4,3], target=7 → min length 2 ([4,3]) 
     we need to find the minimu length subarray whose sum is >=target*/
               int arr[]={2,3,1,2,4,3}; int n=arr.length; int target=7; 
                subarrayLengthHelper(arr,target);
    }   
    public static void subarrayLengthHelper(int arr[],int target){
         int n=arr.length;
        if(arr==null || arr.length==0 ){  System.out.println("-1"); return;      }
        
        int left=0;         int currentSum=0; int minLength=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            currentSum=currentSum+arr[right];

            while(currentSum>=target){
                int currentLength=right-left+1;

                minLength=Math.min(minLength, currentLength);
                currentSum=currentSum-arr[left];
                left++;
            }
        }
            if(minLength == Integer.MAX_VALUE){
                        System.out.println("Result: 0");
                    } else {
                        System.out.println("Minimum Length is: " + minLength);
                    }
                }
}
