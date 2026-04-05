package dsa_jan_revision.arrayBasics;
public class Q_46_Longest_Subarray_with_at_most_k_zeroes {
    public static void main(String args[]){
 /*Problem: Given binary array (0s and 1s) and k, find longest subarray with at most k zeros.
 Example: [1,1,0,0,1,1,1,0,1], k=2 → longest = 7 ([1,1,0,0,1,1,1]) */
         int arr[]={1,1,1,0,0,0,1,1,1,1,0};          int k=2 ;
         subarrayMaxZeroeshelper(arr,k);
    }
    public static void subarrayMaxZeroeshelper(int arr[],int k){
          if(arr==null || arr.length==0 ){  System.out.println("-1"); return;      }
        int n=arr.length; 
        int left=0; int maxLength=Integer.MIN_VALUE; int countZeroes=0;

        for(int right=0;right<n;right++){
            if(arr[right]==0){
                countZeroes++;
            }
            while(countZeroes> k && left<=right){
                if(arr[left]==0){
                    countZeroes--;
                }
                left++;
            }
            int newLength=right-left+1;
            maxLength=Math.max(maxLength, newLength);
        }
         if (maxLength == Integer.MIN_VALUE) {
                  System.out.println("No valid subarray == 0");
          } else {
              System.out.println("Longest subarray with at most " + k + " zeros: " + maxLength);
             }    }            }
