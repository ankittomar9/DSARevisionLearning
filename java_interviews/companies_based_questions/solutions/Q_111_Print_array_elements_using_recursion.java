package java_interviews.companies_based_questions.solutions;

public class Q_111_Print_array_elements_using_recursion {
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        System.out.print("Array elements: ");
        arrayPrinterRecursion(arr,0);
    }

    public static void arrayPrinterRecursion(int arr[],int index){
        if(index==arr.length) {return;}

        System.out.print(arr[index] + " ");
      arrayPrinterRecursion(arr,index+1);

    }


}
