package dsa_jan_revision.arrayBasics;
public class Q_39_Arrays_Subarray_total_sum_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        totalSubarraySumHelper(arr);
    }
    public static void totalSubarraySumHelper(int arr[]){
        if(arr==null || arr.length==0) return;
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
              //  System.out.print();
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                      totalSum=totalSum+sum;
             System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
            }
        }
          System.out.println("Total Sum is : \n"+totalSum);
    }
}
