package dsa_jan_revision.arrayBasics;

public class Q_36_Subarray_Sum_Brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        subarraySumHelper(arr);
    }
    public static void subarraySumHelper(int arr[]){
        if(arr==null || arr.length==0){ return;}
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                System.out.print("SubArray ( "+i+ " , "+j+ ") :  ");
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                  System.out.print(sum);
                 System.out.println("");
            }
        }

    }
}
