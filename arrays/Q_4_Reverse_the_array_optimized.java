package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_4_Reverse_the_array_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
         System.out.println("Original array \n"+ Arrays.toString(arr));
        int n=arr.length;
        int i=0;int j=n-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


        }
        System.out.println("Reversed array \n"+ Arrays.toString(arr));
    }
    
}

/*
TC: O(n)
SC :O(1)
*/