package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_46_Count_Even_and_Odd_Numbers_in_an_Array {
    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5, -3, 0, -4,19};
        System.out.println("Array: " + Arrays.toString(arr));
        countEvenOdd(arr);
    }
    public static void countEvenOdd(int[] arr){
        if(arr==null || arr.length==0){
            System.out.println("Even: 0, Odd: 0");return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers:  " + oddCount);
    }
}
