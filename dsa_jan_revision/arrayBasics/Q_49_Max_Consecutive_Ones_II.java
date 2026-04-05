package dsa_jan_revision.arrayBasics;

public class Q_49_Max_Consecutive_Ones_II {
    public static void main(String args[]){
        int arr[]={1,0,1,1,0,1};
        int k=1;
        max_Consecutive_Ones_Helper(arr,k);
        }
    public static void max_Consecutive_Ones_Helper(int arr[],int k){
        int n=arr.length;
         if(arr==null || arr.length==0) return;
        
         int left=0; int maxLength=0; int zeroCount=0;

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
            int newLength=right-left+1;
            maxLength=Math.max(newLength, maxLength);
         }
      System.out.println("Max Consecutive Ones(length)(flipping 1 zero): \n" + maxLength);
    
    }
}
