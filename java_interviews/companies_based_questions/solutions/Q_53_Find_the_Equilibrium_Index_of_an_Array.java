package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_53_Find_the_Equilibrium_Index_of_an_Array {
    public static void main(String args[]){
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Array : "+Arrays.toString(arr));
        int eqIndex=findEquilibrium(arr);
          
        if (eqIndex != -1) {
            System.out.println("Equilibrium found at index: " + eqIndex);
        } else {
            System.out.println("No equilibrium index exists.");
        }
    }
    public static int findEquilibrium(int arr[]){
        if(arr==null || arr.length ==0){      return -1;        }

        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }

        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            int rightSum =totalSum-leftSum-arr[i];
        
        if(leftSum==rightSum){
            return i;
        }
        leftSum=leftSum+arr[i];
    }
    return -1;
    }
}