package java_interviews.companies_based_questions.solutions;

public class Q_67_Check_Alphabet {
    public static void main(String args[]) {
        char test1 = 'K';
        char test2 = 'm';
        char test3 = '8';
        char test4 = '*';

        System.out.println("'" + test1 + "' is alphabet : " + isAlphabet(test1));
        System.out.println("'" + test2 + "' is alphabet : " + isAlphabet(test2));
        System.out.println("'" + test3 + "' is alphabet : " + isAlphabet(test3));
        System.out.println("'" + test4 + "' is alphabet : " + isAlphabet(test4));
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