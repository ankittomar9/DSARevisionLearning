package java_interviews.companies_based_questions.solutions;
import java.util.HashSet;
/*Question 42: Check if Two Arrays are Disjoint */
public class Q_42_Disjoint_array_Check {
    public static void main(String args[]){
        int[] arr1 = {12, 34, 11, 9};
        int[] arr2 = {72, 85, 90}; // Change 85 to 11 to test the false case
        
        if (areDisJoint(arr1, arr2)) {
            System.out.println("The arrays are Disjoint (No common elements).");
        } else {
            System.out.println("The arrays are NOT Disjoint (They share elements).");
        }
    }
    public static boolean areDisJoint(int arr1[],int arr2[]){
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return true; 
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
           if(set.contains(arr2[i])){
            return false;
           }
        }
        return true;
    }
    
}
