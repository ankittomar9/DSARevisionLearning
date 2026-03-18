package dsa_jan_revision.arrayBasics;

public class Q_9_Time_To_Equality {
    /*Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.
 */
    public static void main(String args[]){
        int arr[]={2,4,1,3,2};
        int result=solve(arr);
        System.out.println("Minimum time to equality : "+result);
    }
    public static int solve(int arr[]){
        if(arr==null || arr.length==0){System.out.println("Array is null or Empty"); return 0;}

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int total_time=0;
         for(int i=0;i<arr.length;i++){
            total_time=total_time+arr[i];
         }
         total_time=total_time-max;
         return total_time;
    }
}
