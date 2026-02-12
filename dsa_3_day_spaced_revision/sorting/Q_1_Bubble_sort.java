package dsa_3_day_spaced_revision.sorting;
import java.util.Arrays;
public class Q_1_Bubble_sort {
    public static void main(String args[]){
       int arr[]={5,1,4,2,8,6,3};
       // int arr[]={1,2,3,4};
        System.out.println("Before Sorting : \n"+Arrays.toString(arr));
        bubbleSortHelper(arr);
           System.out.println("After Sorting : \n"+Arrays.toString(arr));
    }
    public static void bubbleSortHelper(int arr[]){
        int n=arr.length; 
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;    
                }
            }
            if(isSwapped ==false){
                 System.out.println("Array sorted early at pass: " + i);
                    break; 
            }
        }
    }
    
}
