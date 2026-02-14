package DSARevisionLearning.sorting;
import java.util.Arrays;
public class Q_4_Quick_Sort {
    public static void main(String args[]){
        int arr[]={10,80,30,90,40}; int n=arr.length;
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        quickSort(arr,0,n-1);
        System.out.println("\nSorted Array : \n"+Arrays.toString(arr));
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
        public static int partition(int arr[],int low,int high){
            int pivot=arr[high];
            int  pIndex=low;

            for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    swap(arr, pIndex, j);
                    pIndex++;
                }
            }
            swap(arr, pIndex, high);
            return pIndex;
        }
        public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
}
