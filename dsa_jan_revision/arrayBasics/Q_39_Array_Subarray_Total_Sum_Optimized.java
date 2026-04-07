package dsa_jan_revision.arrayBasics;

public class Q_39_Array_Subarray_Total_Sum_Optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        subArrayTotalSumHelper(arr);
    }
    public static void subArrayTotalSumHelper(int arr[]){
        int n=arr.length;
        long total_Sum=0;

        for(int i=0;i<n;i++){
            long subArrayApprearances=(long)(i+1)*(n-i);
            total_Sum=total_Sum+(arr[i]*subArrayApprearances);

              System.out.println("Element " + arr[i] + " appears in "
               + subArrayApprearances + " subarrays.");
        }

         System.out.println("Total Sum is : " + total_Sum);

    }
}
