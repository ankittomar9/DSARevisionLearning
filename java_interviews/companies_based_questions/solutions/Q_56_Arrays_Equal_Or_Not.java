package java_interviews.companies_based_questions.solutions;
import java.util.HashMap;
public class Q_56_Arrays_Equal_Or_Not {
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 5, 2};
        int[] arr2 = {2, 5, 1, 2};
        
        if (areArraysEqual(arr1, arr2)) {
            System.out.println("The arrays are EQUAL (ignoring order).");
        } else {
            System.out.println("The arrays are NOT equal.");
        }
    }
    public static boolean areArraysEqual(int[] a, int[] b) {
        // Edge cases and length check
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i=0; i<a.length; i++) {
            int currentNumber = a[i];
            frequencyMap.put(currentNumber, frequencyMap.getOrDefault(currentNumber, 0) + 1);
        }
        for (int i=0; i<b.length; i++) {
            int currentNumber = b[i];

          
            if (!frequencyMap.containsKey(currentNumber) || frequencyMap.get(currentNumber) == 0) {
                return false;
            }
            frequencyMap.put(currentNumber, frequencyMap.get(currentNumber) - 1);
        }
        return true;
    }
}