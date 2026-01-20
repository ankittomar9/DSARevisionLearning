package DSARevisionLearning.arrays;
import java.util.Arrays;
public class Q_1_Rotate_array_k_times_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5}; //expected output was 4 5 1 2 3
        int n=arr.length;
         System.out.println(" Original Array  \n"+Arrays.toString(arr));
        int k=2;        k=k%n;
        reverseHelper(arr,0,n-1);
        reverseHelper(arr,0,k-1);
        reverseHelper(arr,k,n-1);
    }
    public static void reverseHelper(int arr[],int start,int end){
        int i=start;int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(" Rotated Array  \n"+Arrays.toString(arr));
    }   
}



