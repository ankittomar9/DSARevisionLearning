package dsa_3_day_spaced_revision.arrays;

import java.util.Arrays;

public class Q_37_Subarray_sum_Optimized_1 {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int n=arr.length;
        int prefix_arr[]=new int[n];
        prefix_arr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        System.out.println("Prefix Array : \n"+Arrays.toString(prefix_arr));
        int s=0;int e=0;
        for(int i=0;i<arr.length;i++){
          
            for(int j=i;j<n;j++){
                  int sum=0;    s=i;e=j;
                if(i==0){
                    sum=prefix_arr[e];
                }else{
                    sum=prefix_arr[e]-prefix_arr[s-1];
                }
                  System.out.println("Subarray sum ("+i+" "+j+") : "+sum);
            }
        }
    }
    
}
