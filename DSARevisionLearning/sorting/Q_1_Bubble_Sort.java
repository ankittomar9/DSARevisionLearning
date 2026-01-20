package DSARevisionLearning.sorting;

import java.util.Arrays;

public class Q_1_Bubble_Sort {
    public static void main(String args[]){
        int arr[]={7,4,5,8,1,3,2,9,6}; 
      //  int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length; boolean swapped=false;
           if(n==0){
            System.out.println("Array is Empty");return ;           } 
            
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                         arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped=true;
                    }
                }
                if (!swapped) break;
            }
            if(swapped==true){
                  System.out.println("Sorted array asc \n"+Arrays.toString(arr));
            }else{
                  System.out.println("Array is already sorted ");
            }
          
    }
    
}
