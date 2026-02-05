package DSARevisionLearning.recursion;
public class Q_7_Check_if_array_is_sorted_or_not {
    public static void main(String args[]){
        //int arr[] = {1,2,3,4,5};
        int arr[]={1,2,4,3}; 
         int index=0; // to check if array is sorted we need to check arr[i]>arr[i+1]
        boolean result=isArraySorted(arr,index);
        if(result){
            System.out.println("Array is Sorted");
        }else{
             System.out.println("Array is not  Sorted");        }
    }
      public static boolean isArraySorted(int arr[],int index){   
        //base case
        if(index ==arr.length-1){
            return true;
        }
        //Main logic
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isArraySorted(arr,index+1);
     }   
}
/*TC: O(N)
  SC:O(N) 
*/
