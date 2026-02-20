package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_34_Sort_an_array_without_using_inbuilt_Library {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8};
         System.out.println("Before sort"+Arrays.toString(arr));
        bubbleSortHelper(arr);    
          System.out.println("Sorted array"+Arrays.toString(arr));
    }
    public static void bubbleSortHelper(int arr[]){
       if(arr==null || arr.length==0){return;}
         int n=arr.length;
         for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                System.out.println("Array sorted early! Breaking at pass: " + (i + 1));
                break;
            }
         }  
 
    }
   
}
