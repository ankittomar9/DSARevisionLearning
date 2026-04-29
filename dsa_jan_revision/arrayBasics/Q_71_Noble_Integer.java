package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_71_Noble_Integer {
    /*Given an integer array A, find if an integer p exists in the array 
 such that the number of integers strictly greater than p in the array is equal to p. 
    Return 1 if such an integer exists, otherwise return -1. */
    public static void main(String[] args) {
            int arr1[]={3,2,1,3}; System.out.println("Evaluating : "+Arrays.toString(arr1));
            System.out.println("Result  : "+solve(arr1));

            int arr2[]={1,1,3,3}; 
            System.out.println("Evaluating : "+Arrays.toString(arr2));
            System.out.println("Result  : "+solve(arr2));
        }
    public static int solve(int arr[]){
        if(arr==null || arr.length==0){ return 0;}
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i<n-1 && arr[i]==arr[i+1]){
                continue;
            }
            int strictlyGreaterCount=n-i-1;
            if(arr[i]==strictlyGreaterCount){
                return 1;
            }
        }
        return -1;
    }
}
