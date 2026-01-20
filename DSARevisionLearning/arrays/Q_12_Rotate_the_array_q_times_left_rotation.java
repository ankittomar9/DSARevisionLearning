package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_12_Rotate_the_array_q_times_left_rotation {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};int n=arr.length;
        int k=2;
        k=k%n;
       // int start=0;int end=n-1;

         RotateHelper(arr,0,k-1);
         RotateHelper(arr,k,n-1);
         RotateHelper(arr,0,n-1);

    }

    public static void RotateHelper(int arr[],int start,int end){
        int i=start;int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

        System.out.println("Left Rotated Array k times");
        System.out.println(Arrays.toString(arr));
    }
    
}
