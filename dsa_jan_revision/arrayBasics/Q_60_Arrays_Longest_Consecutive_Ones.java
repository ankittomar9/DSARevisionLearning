package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_60_Arrays_Longest_Consecutive_Ones {
    public static void main(String[] args) {
        int nums[]={1,1,1,0,1,1,0,1};
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("\nMax Consecutive Ones: " + solveLongestConsecutiveOnesHelper(nums));
    }
    public static int solveLongestConsecutiveOnesHelper(int nums[]) {
    if (nums == null || nums.length == 0) {
        System.out.print("Empty or Null array");
        return 0;
    }

    int n = nums.length;
    int totalOnes = 0;
    for (int num : nums) {
        if (num == 1) totalOnes++;
    }
    if (totalOnes == n) return n;
    if (totalOnes == 0) return 0;

    int prefixLeftArr[] = new int[n];
    prefixLeftArr[0] = (nums[0] == 1) ? 1 : 0;
    for (int i = 1; i < n; i++) {
        if (nums[i] == 1) {
            prefixLeftArr[i] = prefixLeftArr[i - 1] + 1;
        } else {
            prefixLeftArr[i] = 0;
        }
    }

    int prefixRightArr[] = new int[n];
    prefixRightArr[n - 1] = (nums[n - 1] == 1) ? 1 : 0;
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] == 1) {
            prefixRightArr[i] = prefixRightArr[i + 1] + 1;
        } else {
            prefixRightArr[i] = 0;
        }
    }

    int maxLength = 0;
    for (int i = 0; i < n; i++) {
        if (nums[i] == 0) {
            int l = (i == 0) ? 0 : prefixLeftArr[i - 1];
            int r = (i == n - 1) ? 0 : prefixRightArr[i + 1];
            if (l + r < totalOnes) {
                maxLength = Math.max(maxLength, l + r + 1);
            } else {
                maxLength = Math.max(maxLength, l + r);
            }
        }
    }
    return maxLength;
}
}
