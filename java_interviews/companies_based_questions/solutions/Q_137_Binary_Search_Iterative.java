package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_137_Binary_Search_Iterative {
    public static void main(String args[]){
        int arr[]={2,14,19,23,31,45,56,68,72,84,91};
        System.out.println("Original Array \n"+Arrays.toString(arr));
        int target = 72; System.out.println("Binary Search  for target "+target);
        int result=binarySearchHelper(arr, target);

        if(result==-1){
            System.out.println("Target not  found");
        }else{
             System.out.println("Target found at index: " + result);
        }    }
    public static int binarySearchHelper(int arr[],int target){
         if(arr==null || arr.length==0){System.out.println("Array is null or empty");
         return -1;}

         int low=0;         int high=arr.length-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                  high=mid-1;
           }         }
         return -1;
    }
}
