package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_41_Merge_two_Sorted_Array {
    public static void main(String args[]){
        int arr1[]={1,3,5};        int arr2[]={2,4,6,8};
        //Output [1,2,3,4,5,6,8]
        int[] merged=mergeArrays(arr1,arr2);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
    public static int[] mergeArrays(int[] arr1,int[] arr2  ){
        if(arr1==null || arr1.length==0)return arr2;
        if(arr2==null || arr2.length==0)return arr1;
        int n1=arr1.length; int n2=arr2.length;

        int[] result= new int[n1+n2];

        int i=0; int j=0; int k=0;
        while(i< n1 && j < n2 ){
            if(arr1[i]<=arr2[j]){
                result[k]=arr1[i];
                i++;
            }else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        // If arr2 has leftovers...
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;

    }
}
