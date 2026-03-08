package java_interviews.companies_based_questions.solutions;
public class Q_71_Count_Vowels {
    public static void main(String args[]) {
        String input = "Hello World 123!";
        
        System.out.println("Original String: " + input);
        int vowelCount = countVowels(input);
        System.out.println("Total Vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        // Edge cases
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";


        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}