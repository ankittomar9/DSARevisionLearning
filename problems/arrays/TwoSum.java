// TwoSum.java
// Simple Two Sum implementation with HashMap
// Example usage and a basic main method for quick testing

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Returns indices of the two numbers such that they add up to target.
    // If no solution found returns [-1, -1].
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    // Simple main for manual testing:
    // Example: java TwoSum
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}