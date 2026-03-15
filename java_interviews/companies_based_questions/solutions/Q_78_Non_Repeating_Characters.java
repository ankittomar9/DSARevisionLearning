package java_interviews.companies_based_questions.solutions;
public class Q_78_Non_Repeating_Characters {
    public static void main(String args[]) {
        String input = "google";
        
        System.out.println("String: " + input);
        System.out.print("Non-repeating characters: ");
        findNonRepeating(input);
    }
    public static void findNonRepeating(String str) {
        if (str==null || str.isEmpty()) return;
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        boolean found = false;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
        
            if (freq[ch]==1) {
                System.out.print(ch + " ");
                found=true;
            }
        }
        if (!found) {
            System.out.print("None found.");
        }
        System.out.println();
    }
}