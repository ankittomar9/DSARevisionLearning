package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_139_Bubble_Sort {
    public static void main(String args[]){
        int arr[]={64,34,25,12,22,11,90};
        System.out.println("Original Array: \n" + Arrays.toString(arr));
        bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]){
         if (arr==null || arr.length<=1) {    return;         }
         int n=arr.length;boolean isSwapped=false;

         for(int i=0;i<n-1;i++){
            
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
         }
         if(isSwapped==true){
                  System.out.println("Sorted array asc \n"+Arrays.toString(arr));
            }else{
                  System.out.println("Array is already sorted ");
            }
            }
}
