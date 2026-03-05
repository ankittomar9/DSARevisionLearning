package dsa_revision_miscellaneous.arrays;
import java.util.Arrays;
public class Q_02_Remove_Duplicates_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        System.out.println("Original Array: \n" + Arrays.toString(nums));

        int uniqueCount = removeDuplicates(nums);
        
        System.out.println("Unique Elements Count: \n" + uniqueCount);
        System.out.print("Modified Array (Unique Part): \n");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
               if (nums == null || nums.length == 0) return 0;
                int i = 0;
        for (int j = 1; j < nums.length; j++) {
    
            if (nums[j] != nums[i]) {
                i++; 
                nums[i] = nums[j]; 
            }
        }
        return i + 1;
    }
}