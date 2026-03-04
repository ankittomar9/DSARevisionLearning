package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q_57_Kth_Smallest_Element {
    public static void main(String args[]) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Finding the " + k + "rd smallest element...");
        
        int result = findKthSmallest(arr, k);
        System.out.println("The element is: " + result);
    }

    public static int findKthSmallest(int[] arr, int k) {
        // Edge cases
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input or K value.");
        }

        // Create a MAX-HEAP (Largest element stays at the top)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            // Let the current person into the VIP room
            maxHeap.add(arr[i]);

            // If the room has more than K people, kick out the tallest one!
            if (maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }
        return maxHeap.peek();
    }
}