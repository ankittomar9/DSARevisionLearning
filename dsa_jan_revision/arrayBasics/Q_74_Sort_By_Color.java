package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_74_Sort_By_Color {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
         System.out.println("Evaluating: Original Array: \n"+Arrays.toString(arr));
         solve(arr);
         System.out.println("Sorted Array : \n"+Arrays.toString(arr));
    }
    public static void solve(int arr[]){
         if(arr==null || arr.length==0){return ;}
        int n=arr.length;
        int low=0;int mid=0; int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swapHelper(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }
                else if( arr[mid]==2){
                    swapHelper(arr, mid, high);
                    high--;
                }
        }
    }
    public static void swapHelper(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
