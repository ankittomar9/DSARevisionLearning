package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_141_Insertion_Sort {
    public static void main(String args[]){
        int arr[]={43,31,26,29,12,2,8,45,63};
        System.out.println("Original Array: \n" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: \n" + Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]){
        if(arr==null || arr.length<=1){
           System.out.println("empty or null array "); return; 
        }
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
