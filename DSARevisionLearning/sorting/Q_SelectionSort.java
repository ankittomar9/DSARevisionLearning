package DSARevisionLearning.sorting;
import java.util.Arrays;
public class Q_SelectionSort {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8};
       System.out.println("Before Sorting: \n" + Arrays.toString(arr));
        selectionSortHelper(arr);
        System.out.println("After Sorting: \n" + Arrays.toString(arr));
    }
    public static void selectionSortHelper(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;      
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }    
}
