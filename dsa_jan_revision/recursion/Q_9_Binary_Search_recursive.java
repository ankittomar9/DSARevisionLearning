package dsa_jan_revision.recursion;
import java.util.Arrays;
public class Q_9_Binary_Search_recursive {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7}; int target=4;        int result=binarySearch(arr, target);
        System.out.println("Original Array : " + Arrays.toString(arr));
         if(result!=-1){
            System.out.println("Target Found at "+result);
        }else{
              System.out.println("Target Not Exists ");
        }  
    }
    public static int binarySearch(int arr[],int target){
      if (arr== null || arr.length == 0) {            return -1;        }
       return binarySearchHelper(arr,target,0,arr.length-1);       
    }
    public static int binarySearchHelper(int arr[],int target,int low,int high){
        if(low>high){ // base case
            return -1;
        }
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearchHelper(arr, target, mid+1, high);
        }else{
            return binarySearchHelper(arr, target, low, mid-1);
        }
    }
}
