package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;
import java.util.HashSet;

public class Q_55_Subset_Array {
    public static void main(String args[]) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1}; //  adding a number not in arr1 to test 'false'
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        
        if (isSubset(arr1, arr2)) {
            System.out.println("Result: arr2 IS a subset of arr1.");
        } else {
            System.out.println("Result: arr2 is NOT a subset of arr1.");
        }
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Edge Cases
        if (arr1 == null || arr2 == null) return false;
        if (arr2.length==0) return true; // An empty array is technically a subset of any array
        if (arr2.length >arr1.length) return false; // arr2 can't be a subset if it's larger!

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            if (!set.contains(arr2[i])) {
                return false; 
            }
        }
        return true;
    }
}