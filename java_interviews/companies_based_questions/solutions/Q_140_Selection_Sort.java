package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_140_Selection_Sort {
    public static void main(String args[]){
        int arr[]={64,25,12,22,11};
        System.out.println("Original Array: \n" + Arrays.toString(arr));
        selectionSortHelper(arr);
        System.out.println("After Sorting: \n" + Arrays.toString(arr));
    }
    public static void selectionSortHelper(int arr[]){
        if(arr==null || arr.length<=1){ return;}
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
