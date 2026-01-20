package dsa_revision_miscellaneous.arrays;

public class Q_46_Subarray_Max_Consecutive_Ones_III_ {
    public static void main(String args[]){
       /*Given a binary array arr and an integer k, 
       find the max length of a subarray that contains at most k zeros.
       arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, k = 2  output 6 */
        int arr[]={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};int k=2;
        int left=0; int maxLength=Integer.MIN_VALUE;
        int zeroCount=0;

        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                zeroCount++;
            }

            while(zeroCount>k){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }
            int newLength=right-left+1;
            maxLength=Math.max(maxLength,newLength);
            
        }
        
        if(maxLength==Integer.MIN_VALUE){
              System.out.println("0");
        }
        else{
              System.out.println("Max Length of subarray k");
                System.out.println(maxLength);
        }
    }
    
}
