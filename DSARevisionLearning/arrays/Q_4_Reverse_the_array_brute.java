package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_4_Reverse_the_array_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
           System.out.println("Original array \n"+ Arrays.toString(arr));
              int n=arr.length;
           int arr2[]=new int[n];
     
        for(int i=0;i<n;i++){
           
                arr2[i]=arr[n-1-i];

            
        }

         System.out.println("Reversed array \n"+ Arrays.toString(arr2));

        

    }
    
}


/*
TC: O(n)
SC :O(N)
*/