package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_11_Multiple_left_rotation_Array {
    public static void main(String args[]) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3}; // Rotate 2 times, then 3 times
        
        System.out.println("Original Array: " + Arrays.toString(A));
      
        int[][] result = solve(A, B);

        System.out.println("Final Result Matrix:");
        // Using traditional loop for printing to maintain control
        for (int i = 0; i < result.length; i++) {
            System.out.println("Rotation " + B[i] + ": " + Arrays.toString(result[i]));
        }
    }
    public static int[][] solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        
        // Matrix: m rows (one for each query), n columns
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            // 1. Clone the master array into a temporary array
            int[] tempArr = new int[n];
            for (int j = 0; j < n; j++) {
                tempArr[j] = A[j];
            }
            
            // 2. Normalize rotation count
            int k = B[i] % n; 

            // 3. Perform Left Rotation on tempArr
            // Step A: Reverse first k elements
            rotateHelper(tempArr, 0, k - 1);
            // Step B: Reverse remaining n-k elements
            rotateHelper(tempArr, k, n - 1);
            // Step C: Reverse the entire temp array
            rotateHelper(tempArr, 0, n - 1);

            // 4. Store the reference in the result matrix
            res[i] = tempArr;
        }
        return res;
    }

    public static void rotateHelper(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) return;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}