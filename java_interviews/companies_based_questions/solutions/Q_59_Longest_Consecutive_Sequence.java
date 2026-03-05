package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.HashSet;
public class Q_59_Longest_Consecutive_Sequence {
    public static void main(String args[]) {
        int[] arr = {100, 4, 200, 1, 3, 2};        
        System.out.println("Array: " + Arrays.toString(arr));
         int longest = findLongestSequence(arr);
        System.out.println("Longest Consecutive Sequence Length: " + longest);
    }
    public static int findLongestSequence(int[] arr) {
        if (arr==null || arr.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
    
        for (int i=0; i<arr.length; i++) {            set.add(arr[i]);        } //add to hashSet
        int longestStreak = 0;
        for (int i=0; i<arr.length; i++) {
            int num = arr[i];

            if (!set.contains(num - 1)) {             
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }            }
        }
        return longestStreak;    }  }