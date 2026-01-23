package DSARevisionLearning.arrays;
public class Q_47_Remove_0_to_Max_Subarray_length {
    public static void main(String args[]){
        /*Problem: Longest Subarray of 1's After Deleting One Element
          Goal: Return the length of the longest subarray of 1s assuming you MUST delete one element. 
            Input: nums = [0,1,1,1,0,1,1,0,1]  Output: 5
            Explanation: After deleting the number in position 4, 
        [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].length is 5            */
       int arr[] = {0, 1, 1, 1, 0, 1, 1, 0, 1};int n=arr.length;
        int countZeroes=0;int left=0; int k=1; int maxLength=Integer.MIN_VALUE;

        for(int right=0;right<n;right++){
            if(arr[right]==0){
                countZeroes++;
            }
            while(countZeroes>k){
                if(arr[left]==0){
                    countZeroes--;
                  }
                    left++;
                }
                 int newMaxLength=right-left;  // do delete 1 element from window right-left+1 we remove 1
                maxLength=Math.max(maxLength, newMaxLength);           
        }
        if(maxLength==Integer.MIN_VALUE){
            System.out.println("Invalid array input ");
        }
          System.out.println("Max Consecutive Ones Length Subarray " + maxLength);
    }
    
}
