package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_36_Subarray_Sum_Optimized1 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        subArraySumHelper(arr);
    }
    public static void subArraySumHelper(int arr[]){
        if(arr==null || arr.length==0){return;}
        int n=arr.length;
        int prefixArr[]=new int [n];

        prefixArr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        System.out.println("Prefix Array : "+Arrays.toString(prefixArr));
        for(int i=0;i<n;i++){
         
            for(int j=i;j<n;j++){
                   int sum=0;
                   System.out.print("Subarray sum ("+i+" , "+j +" )  ");
                int s=i; int e=j;
                if(s==0){
                    sum=prefixArr[e];
                }else{
                    sum=prefixArr[e]-prefixArr[s-1];
                }
                  System.out.print(sum);
                  System.out.println("");
            }
            System.out.println("");
        }
    }
}
