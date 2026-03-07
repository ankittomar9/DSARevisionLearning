package java_interviews.companies_based_questions.solutions;

public class Q_67_Check_Alphabet {
    public static void main(String args[]) {
        char var1 = 'K';
        char var2 = 'm';
        char var3 = '8';
        char var4 = '*';

        System.out.println("'" + var1 + "' is alphabet : " + isAlphabet(var1));
        System.out.println("'" + var2 + "' is alphabet : " + isAlphabet(var2));
        System.out.println("'" + var3 + "' is alphabet : " + isAlphabet(var3));
        System.out.println("'" + var4 + "' is alphabet : " + isAlphabet(var4));
    }

    public static boolean isAlphabet(char ch) {
        // ASCII integer values range 65 A and 97 a
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        } else {
            return false;
        }
        
        // we can actually write this entire function in one single line!
        // return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }
}