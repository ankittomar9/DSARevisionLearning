package java_interviews.companies_based_questions.solutions;

public class Q_39_Remove_Duplicates_from_Sorted_Array {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,4,4};
        //output is {1,2,3,4} length is 3
          int uniqueCount = removeDuplicates(arr);
           System.out.println("Unique Count: " + uniqueCount);
            for(int i=0;i<uniqueCount;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int arr[]){
        if(arr==null || arr.length==0){
            return 0;
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }
        return index+1;
    }
    
}
