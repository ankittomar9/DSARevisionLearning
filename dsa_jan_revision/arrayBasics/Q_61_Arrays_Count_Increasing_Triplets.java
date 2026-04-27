package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_61_Arrays_Count_Increasing_Triplets {
    public static void main(String args[]){
        int arr[]={2,1,4,3,5}; System.out.println("Array: " + Arrays.toString(arr) + "\n");
        System.out.println("\nTotal Increasing Triplets: " + countTriplets(arr));
    }
    public static int countTriplets(int arr[]){
if (arr == null || arr.length == 0) {System.out.print("Empty or Null array"); return 0; }
    
    int n=arr.length;    if(n<3)return 0;
        int totalTriplets=0;

        for(int j=1;j<n-1;j++){
            int leftSmaller=0;
            for(int i=0;i<j;i++){
                if(arr[i]<arr[j]){
                    leftSmaller++;
                }
            }
            int rightLarger=0;
            for (int k=j+1; k<n; k++) {
                if (arr[k] > arr[j]) {
                    rightLarger++;
                }
            }
System.out.println("Evaluating Middleman at index " + j + " (Value " + arr[j] + ")");
System.out.println("Left Smaller = " + leftSmaller + ", Right Larger = " + rightLarger);
System.out.println("-> Triplets = " + (leftSmaller * rightLarger));
            totalTriplets += (leftSmaller * rightLarger);   
        }
        return totalTriplets;
    }   
}