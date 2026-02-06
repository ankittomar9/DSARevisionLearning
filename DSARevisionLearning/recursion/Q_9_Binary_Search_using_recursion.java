package DSARevisionLearning.recursion;

public class Q_9_Binary_Search_using_recursion {
    public static void main(String args[]){
        int arr[]={1,3,4,6,7}; 
         int low=0; int high=arr.length-1;
        int target=9;// false case we can also check for target=6;
        binarySearchHelper(arr,target,low,high);
    }
    public static int  binarySearchHelper(int arr[],int target,int low,int high){
        
        if(low>high){  //base case
            return -1;
        }
        //Main Logic 
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
             return binarySearchHelper(arr,target,mid+1,high);
        }else{
             return binarySearchHelper(arr,target,low,mid-1);
        }

       
    }
    
}
