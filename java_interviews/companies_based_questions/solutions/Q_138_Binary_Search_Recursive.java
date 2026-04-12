package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_138_Binary_Search_Recursive {
    public static void main(String args[]){
        int arr[]={2,14,19,31,45,45,68,72,84,91};
        System.out.println("Original Array: \n"+Arrays.toString(arr));
     int target = 72;System.out.println("Recursive Binary Search for target: " + target);
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
    public static int binarySearch(int arr[],int target){
  if(arr==null || arr.length ==0){System.out.println("Array is null or empty");
            return -1; 
        }
        return binarySearchHelper(arr,target,0,arr.length-1);
    }
    public static int binarySearchHelper(int arr[],int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearchHelper(arr, target, mid+1, high);
        }
         return binarySearchHelper(arr, target, low,mid-1);
    }
}
