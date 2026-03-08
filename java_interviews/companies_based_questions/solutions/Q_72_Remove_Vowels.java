package java_interviews.companies_based_questions.solutions;

public class Q_72_Remove_Vowels {
    public static void main(String args[]) {
        String input = "Computer Science 101!";
        
        System.out.println("Original String: " + input);
        String result = removeVowels(input);
        System.out.println("Vowels Removed:  " + result);
    }

    public static String removeVowels(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Step 1: Set up the baseplate
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        // Step 2: Walk the line
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Step 3: If indexOf returns -1, it means the character is NOT a vowel.
            // We only want to keep the non-vowels!
            if (vowels.indexOf(ch) == -1) {
                // Snap it onto the baseplate
                sb.append(ch);
            }
        }

        // Step 4: Solidify the final build and return it
        return sb.toString();
    }
}