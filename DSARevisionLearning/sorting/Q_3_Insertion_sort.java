package DSARevisionLearning.sorting;
import java.util.Arrays;
public class Q_3_Insertion_sort {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8};
          System.out.println("Before Sorting : "+Arrays.toString(arr));
        insertionSortHelper(arr);
        System.out.println("After Sorting : "+Arrays.toString(arr));
    }
    public static void insertionSortHelper( int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }    
}
