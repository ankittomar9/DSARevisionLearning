package dsa_3_day_spaced_revision.arrays;

public class Q_46_longest_Subrray_with_at_most_k_zeroes {
    public static void main(String args[]){
        /*Problem: Given binary array (0s and 1s) and k, find longest subarray with at most k zeros.
        Example: [1,1,0,0,1,1,1,0,1], k=2 → longest = 7 ([1,1,0,0,1,1,1]) */
      //  int arr[]={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; answer 6
             int arr[]={1,1,0,0,1,1,1,0,1};
         int n=arr.length;
            int k=2;            int maxLength=Integer.MIN_VALUE;  int countZeroes=0;
            int left=0;
            for(int right=0;right<arr.length;right++){
               if(arr[right]==0){
                countZeroes++;
               }
               while(countZeroes>k){
                if(arr[left]==0){
                    countZeroes--;
                }
                left++;
                
             }
             int newMaxLength=right-left+1;
               maxLength=Math.max(newMaxLength, maxLength);
               
      }
            if(maxLength==Integer.MIN_VALUE ){
                System.out.println("No valid subarray == 0");
            }else{
                     System.out.println("Longest subarray with at most " + k + " zeros: " + maxLength);
            }
            
    }
}
