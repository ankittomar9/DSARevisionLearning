package java_interviews.companies_based_questions.solutions;

public class Q_112_Sum_of_array_elements_using_recursion {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        long Sum=sumOfArrayHelper(arr,0);
         System.out.print(  " Sum of Elements is  : \n"+Sum);
    }

    public static long sumOfArrayHelper(int arr[],int index){
         if (arr==null || arr.length==0) {
            return 0;
        }

        if(index==arr.length-1) return arr[index];  

        long Sum=arr[index];
        Sum=Sum+sumOfArrayHelper(arr,index+1);
       
       return Sum;
    }
}
