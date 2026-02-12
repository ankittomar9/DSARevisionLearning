package dsa_3_day_spaced_revision.sorting;
import java.util.Arrays;
public class Q_2_Selection_sort {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8,6,3};
           System.out.println(" Before Sort :\n " + Arrays.toString(arr));
         selectionSortHelper(arr);
       System.out.println(" After Sort :\n " + Arrays.toString(arr));
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
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
