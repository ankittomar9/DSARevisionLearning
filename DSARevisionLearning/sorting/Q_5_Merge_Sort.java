package DSARevisionLearning.sorting;
import java.util.Arrays;
public class Q_5_Merge_Sort {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8,6,3}; int n=arr.length;
        System.out.println("Before Sort \n"+Arrays.toString(arr));

        mergeSortFunc(arr,0,n-1);
    }
    
}
