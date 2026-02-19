package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_33_Sort_Half_Asc_Half_Desc {
    public static void main(String args[]){
        int arr[]={1,90,34,89,7,9};
        System.out.println("Original Array: \n"+Arrays.toString(arr));
        customSortHelper(arr);
        System.out.println("Modified : \n"+Arrays.toString(arr));
    }
    public static void customSortHelper(int arr[]){
        int n=arr.length;
        int mid=n/2;

        Arrays.sort(arr,0,mid);

        Arrays.sort(arr,mid,n);
        reverseSubArray(arr, mid, n - 1);
    }
    public static void reverseSubArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    
}
