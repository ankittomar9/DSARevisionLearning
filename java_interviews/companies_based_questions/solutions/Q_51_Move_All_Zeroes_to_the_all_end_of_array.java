package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_51_Move_All_Zeroes_to_the_all_end_of_array {
    public static void main(String args[]){
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("Modified: " + Arrays.toString(arr));
    }
    public static void moveZeros(int arr[]){
        if(arr==null || arr.length <=1) return;
        int insertPosition=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                insertPosition++;
            }
        }

        while(insertPosition < arr.length){
            arr[insertPosition]=0;
            insertPosition++;
        }
    }
    
}
