package DSARevisionLearning.recursion;
public class Q_9_Binary_Search_using_recursion {
    public static void main(String args[]){
        int arr[]={1,3,4,6,7}; 
        int target=4; int low=0;int high=arr.length-1;
        int result=binaryHelper(arr,target,low,high);

        if(result!=-1){
            System.out.println("Target Found at "+result);
        }else{
              System.out.println("Target Not Exists ");
        }
    }
    public static int binaryHelper(int arr[],int target,int low,int high){
        //base case
        if(low>high){
            return -1;
        }
        //Main Logic
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;       
        }
        if(arr[mid]<target){
            return binaryHelper(arr, target, mid+1, high);
        }else{
            return binaryHelper(arr, target, low, mid-1);
        } 
     }
}
/**
 * TC: O(logN)
    SC:O(logN) Call stack (Number of calls )

*/