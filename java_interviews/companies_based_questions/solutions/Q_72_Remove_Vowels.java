package java_interviews.companies_based_questions.solutions;
public class Q_72_Remove_Vowels {
    public static void main(String args[]) {
        String input = "Computer Science 101!";
        
        System.out.println("Original String: " + input);
        String result = removeVowels(input);
        System.out.println("Vowels Removed:  " + result);
    }
    public static String removeVowels(String str) {
        if (str==null || str.isEmpty()) {
            return str;
        }


        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

        
            if (vowels.indexOf(ch) == -1) {
               
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}