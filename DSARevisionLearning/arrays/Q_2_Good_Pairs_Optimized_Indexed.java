package DSARevisionLearning.arrays;

import java.util.HashMap;
import java.util.Map;

public class Q_2_Good_Pairs_Optimized_Indexed {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 7;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int complement = target - current;

            // Check how many times we have already seen the complement
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Now add / update the frequency of the current number
            int previousCount = map.getOrDefault(current, 0);
            map.put(current, previousCount + 1);
        }

        System.out.println("Number of ordered pairs (i != j) with sum " + target + ": " + count);
        
    }
}