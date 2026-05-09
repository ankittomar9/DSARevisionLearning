package dsa_jan_revision.recursion;

public class Q_7_Check_if_array_is_sorted_or_not {
    public static void main(String[] args) {
            int arr[]={1,2,2,4,3};
            int index=0;
            boolean result=isArraySortedHelper(arr, index);
            if(result){
                System.out.println("Array is Sorted : ");
            }else{
                   System.out.println("Array is not Sorted : ");
            }
    }
    public static boolean isArraySortedHelper(int arr[],int index){
        if(index==arr.length-1){
            return true;}
            if(arr[index]>arr[index+1]){
                return false;
            }
            return isArraySortedHelper(arr, index+1);
    }
}
