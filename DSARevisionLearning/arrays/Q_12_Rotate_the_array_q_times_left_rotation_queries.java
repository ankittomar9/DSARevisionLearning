package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_12_Rotate_the_array_q_times_left_rotation_queries {
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        int[] queries = {2, 3, 1};
        
        for (int i = 0; i < queries.length; i++) {
            // Fresh copy for this query
            int[] copy_arr = Arrays.copyOf(arr, n);
            
            // Use the actual query value, not the index i
            int k = queries[i] % n;
            
            // If k == 0, no rotation needed
            if (k == 0) {
                System.out.println("Rotate by " + queries[i] + "  no change: " + 
                                 Arrays.toString(copy_arr));
                continue;
            }
            
            // Apply the three reverses on the COPY, not on original arr
            RotateHelper(copy_arr, 0, k - 1);
            RotateHelper(copy_arr, k, n - 1);
            RotateHelper(copy_arr, 0, n - 1);
            
            // Print using the copy and the actual query value
            System.out.println("After left rotate by " + queries[i] + ": " + 
                             Arrays.toString(copy_arr));
        }
    }

    public static void RotateHelper(int arr[], int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // You can keep these commented or remove them
        // System.out.println("Left Rotated Array k times");
        // System.out.println(Arrays.toString(arr));
    }
}