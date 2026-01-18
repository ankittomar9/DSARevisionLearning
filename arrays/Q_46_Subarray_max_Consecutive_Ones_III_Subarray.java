package DSARevisionLearning.arrays;
public class Q_46_Subarray_max_Consecutive_Ones_III_Subarray {
    /*Goal: Given a binary array (only 0s and 1s) and an integer k,
     find the maximum length of a subarray that contains at most k zeros 
     arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, k = 2  expected output [0, 0, 1, 1, 1, 1] max =6 */
    public static void main(String args[]){
     int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int k=2;
     int n=arr.length;
     int maxLength=0; int zeroCount=0;
     int left=0; 
     
     for(int right=0;right<n;right++){
        if(arr[right]==0){
            zeroCount++;
        }
        while(zeroCount>k){
            if(arr[left]==0){
                zeroCount--;
            }
            left++;
        }
        maxLength=Math.max(maxLength, right-left+1);
     }
     System.out.println("Max Consecutive Ones (with " + k + " flips): \n" + maxLength);


    }
    
}
