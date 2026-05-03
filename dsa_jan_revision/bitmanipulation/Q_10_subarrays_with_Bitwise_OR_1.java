package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_10_subarrays_with_Bitwise_OR_1 {
    public static void main(String[] args) {
        int arr[]={1,0,1,0};System.out.println("Evaluating Array:" +Arrays.toString(arr));
        solve(arr);
int arr2[]={0, 0, 1, 0, 0, 0};System.out.println("\nEvaluating Array: " + Arrays.toString(arr2));
        solve(arr2);
    }
    public static void solve(int arr[]){
     if(arr==null || arr.length==0){System.out.println("Array is empty or null");return;}
        int n=arr.length;
        long totalSubarrays=(long)n*(n+1)/2;
        long badSubarrays=0; //subarray having only zero;
        long count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }else{
                badSubarrays=badSubarrays + (count*(count+1)/2);
                 count = 0;
            }
        }
        // check the count of subarrays
            if(count > 0){
                badSubarrays = badSubarrays +(count*(count+1)/2);
            }
        long goodSubarrays=totalSubarrays - badSubarrays;
        System.out.println("Total Subarrays: " + totalSubarrays);
        System.out.println("Bad Subarrays: " + badSubarrays);
        System.out.println("Good Subarrays: " + goodSubarrays);
    }
}
