package dsa_jan_revision.arrayBasics;
  /* given an array of integers nums of size N.
        Return the difference between the maximum among all even
            numbers of nums and the minimum among all odd numbers in nums. */
public class Q_10_Arrays_Minimum_Pick {
    public static void main(String args[]){
        int arr[]={5,4,20,3,19,15,6};
        minimumPicksHelper(arr);
    }
    public static void minimumPicksHelper(int arr[]){
        if(arr==null || arr.length==0){            System.out.println("Array is Empty or null  "); return;
        }
        int maxEven=Integer.MIN_VALUE;  int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                if(arr[i]>maxEven){
                    maxEven=arr[i];
                }
            }else if(arr[i]%2!=0){
                if(arr[i]<minOdd){
                    minOdd=arr[i];
                }
            }
        }
        // System.out.println(maxEven);        //  System.out.println(minOdd);
        int result=Math.abs(maxEven)-Math.abs(minOdd) ;
                     System.out.println("The absolute difference is : "+result);
    }
}
