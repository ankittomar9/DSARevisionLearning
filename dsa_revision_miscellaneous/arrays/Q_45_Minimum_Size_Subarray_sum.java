package dsa_revision_miscellaneous.arrays;

public class Q_45_Minimum_Size_Subarray_sum {
    public static void main(String args[]){
          /* Given an array of positive integers and a target value, find the minimal length of a 
        contiguous subarray whose sum is greater than or equal to the target
        target = 7, arr = {2, 3, 1, 2, 4, 3} subarray [4, 3] length is 2*/
        int arr[]={2,3,1,2,4,3};int n=arr.length;
        int target=7; int left=0;
        int currentSum=0;int minLength=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            currentSum=currentSum+arr[right];    

            while(currentSum>=target){
                int newMinLength=right-left+1;
                minLength=Math.min(newMinLength, minLength);
                currentSum=currentSum-arr[left];
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            System.out.println("Invalid Input");
        }else{
             System.out.println("Minimum Length of subarray  \n"+minLength);
        }
         
    }   
}
