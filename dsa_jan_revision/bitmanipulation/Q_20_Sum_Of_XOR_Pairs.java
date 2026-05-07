package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_20_Sum_Of_XOR_Pairs {
    public static void main(String[] args) {
        int arr1[]={1,2,3};System.out.println("Original Array : \n"+Arrays.toString(arr1));
         System.out.println("Total Sum of XOR Pairs: " + solve(arr1) + "\n");

         int arr2[]={5,9,7,6};System.out.println("Original Array : \n"+Arrays.toString(arr2));
         System.out.println("Total Sum of XOR Pairs: " + solve(arr2) + "\n");
    }
    public static int solve(int arr[]){
           if(arr==null || arr.length==0){System.out.println("empty or Null array \n");return 0;}
        long mod=1000000007; long totalSum=0; int n=arr.length;

        for(int i=0;i<31;i++){
            long count1=0; long count0=0;

            for(int j=0;j<n;j++){
                if((arr[j] & (1L<<i))!=0){
                    count1++;
                }else{
                    count0++;
                }
            }
            long validPairs =(count1*count0)%mod;
            long bitValue= (1L<<i) % mod;
            long contribution =(validPairs*bitValue) % mod;
            totalSum=(totalSum+contribution)%mod;
        }
        return (int) totalSum;
    }
}
