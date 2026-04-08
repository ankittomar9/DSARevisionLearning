package java_interviews.companies_based_questions.solutions;

public class Q_131_Zig_Zag_Pattern {
   public static void main(String args[]) {
        int N = 9; 
        System.out.println("Zig-Zag Pattern for N = " + N + ":\n");
        printZigZag(N);
    }
    public static void printZigZag(int N) {
        // Step 1: A standard zig-zag wave is traditionally 3 rows tall
        for (int i = 1; i <= 3; i++) {
            // Step 2: Loop across N columns
            for (int j = 1; j <= N; j++) {
                
                // Step 3: The Modulo Magic
                // Condition 1: Downward slopes ((i+j) is a multiple of 4)
                // Condition 2: Upward slopes (Row 2, and j is a multiple of 4)
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for perfect alignment
                }
            }   
            // Step 4: Drop to the next row of the grid
            System.out.println();
        }
    }
}
    

