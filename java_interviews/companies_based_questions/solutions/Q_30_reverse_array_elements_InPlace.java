package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_30_reverse_array_elements_InPlace {
    public static void main(String args[]){
        int arr[]={1,2,4,6,8,9,12,14};
        System.out.println("Original Array"+Arrays.toString(arr));
        reverseHelper(arr);
        System.out.println("Reversed Array \n"+Arrays.toString(arr));
    }
    public static void reverseHelper(int arr[]){
        if (arr == null || arr.length <= 1) {
            return; // Nothing to reverse
        }
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;    j--;
        
        }
    
    }
}
/*TC : is O(N)
  SC :  is O(1) 
  Approach Run a Loop in reverse will also print the elements but it won't swap the location of elements
  */