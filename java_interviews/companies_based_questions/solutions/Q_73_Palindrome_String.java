package java_interviews.companies_based_questions.solutions;

public class Q_73_Palindrome_String {
    public static void main(String args[]) {
        String var1 = "Racecar";
        String var2 = "Computer";
        
        System.out.println("Is '" + var1 + "' a palindrome? " + isPalindrome(var1));
        System.out.println("Is '" + var2 + "' a palindrome? " + isPalindrome(var2));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}