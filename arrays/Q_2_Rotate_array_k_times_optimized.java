package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_2_Rotate_array_k_times_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5}; //expected output was 3 4 5 1 2
        int n=arr.length;
        int k=2;

        reverseHelper(arr,0,n-1);
        reverseHelper(arr,0,k);
           reverseHelper(arr,k,n-1);
    }
    public static void reverseHelper(int arr[],int start,int end){
        int i=start;int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("Array Rotate \n"+Arrays.toString(arr));
    }
    
}
