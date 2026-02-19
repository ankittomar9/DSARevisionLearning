package java_interviews.companies_based_questions.solutions;

public class Q_31_Check_If_Array_Is_Sorted {
    public static void main(String args[]){
         int arr[]={1,2,6,4,8,9,12,14};
    
            boolean result=isArraySortedHelper(arr);
            if(result){
                System.out.println("Array is Sorted");
            }else{
                System.out.println("Array is not Sorted");
            }
        }
    public static boolean isArraySortedHelper(int arr[]){
        if(arr==null || arr.length==0){
            return true;
        }
        int n=arr.length;
        boolean isSorted=true;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                System.out.println("Violation Found at index : "+i);
                break;
            }
        }
        return isSorted;
    }
}

/*TC : is O(N)
  SC :  is O(1)  */
