package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_58_Leaders_In_Array {
    public static void main(String args[]) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Leaders found (Right to Left):");
        findLeaders(arr);
    }
    public static void findLeaders(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        
        // Step 1: The rightmost element is ALWAYS a leader
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            
            
            if (arr[i] > maxFromRight) {
                // Set it leader! 
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i];
            }
        }
        System.out.println(); 
    }
}