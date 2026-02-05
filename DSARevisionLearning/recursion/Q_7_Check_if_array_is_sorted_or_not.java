package DSARevisionLearning.recursion;

public class Q_7_Check_if_array_is_sorted_or_not {
    public static void main(String args[]){
        //int arr[] = {1,2,3,4,5};
        int arr[]={1,2,4,3};
        int index=0;
        boolean result=isArraySortedHelper(arr,0);

        if(result){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is Not Sorted");
        }
        
    }
    public static boolean isArraySortedHelper(int arr[],int index){
        boolean isCheck=false;
       
        //base case
        if(index == arr.length-1){
            return true;
        }

        //main logic
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isArraySortedHelper(arr,index+1);
    }
    
}
