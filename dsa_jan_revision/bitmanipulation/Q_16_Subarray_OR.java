package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_16_Subarray_OR {
    public static void main(String[] args) {
        int arr1[]={1,2,3};  System.out.println("Original Array : "+ Arrays.toString(arr1));
        System.out.println("Total SUBARRAY OR sum " + solve(arr1) + "\n");

        int arr2[]={7,8,9,10};  System.out.println("Original Array : "+ Arrays.toString(arr2));
        System.out.println("Total SUBARRAY OR sum " + solve(arr2) + "\n");
    }
    public static int solve(int arr[]){
        if(arr==null || arr.length==0){ System.out.println("Empty or null Array :");return  0;}
        long mod=1000000007; int n=arr.length; long ans=0;
        long  totalSubarrays = (long)n * (n+1)/2;
        for(int i=0;i<=30;i++){
            long count=0;         
               long badSubarrays =0;

            for(int j=0;j<n;j++){
                if((arr[j] & (1<<i))==0){
                    count++;}
                else{
                    badSubarrays =badSubarrays + (count * (count+1))/2;
                    count=0;   }       }
            if (count > 0) {badSubarrays += (count * (count + 1)) / 2;         }
            long goodSubarrays =totalSubarrays - badSubarrays;
            long bitValue =(1L<< i) %mod;
            long contribution=( goodSubarrays % mod * bitValue) %mod;
            ans=(ans +contribution)%mod;
        }
        return (int) ans;   
     } 
  }
