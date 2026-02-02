package dsa_jan_revision.arrays;

public class Q_3_Array_Min_Max_optimized {
    public static void main(String args[]){
        int arr[]={11,10,99,44,2,5,7,6};
    
        //brute we can say we find min max in two passes or sort
        //  the array and we will get max and min first and last poisiton
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max Element in array : "+max);
             System.out.println("min Element in array : "+min);
    }
}
