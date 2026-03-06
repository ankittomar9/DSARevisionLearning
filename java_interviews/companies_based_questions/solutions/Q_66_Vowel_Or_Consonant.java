package java_interviews.companies_based_questions.solutions;

public class Q_66_Vowel_Or_Consonant {
    public static void main(String args[]) {
        char testChar1 = 'E';
        char testChar2 = 'z';
        char testChar3 = '7'; //edge case 

        checkCharacter(testChar1);
        checkCharacter(testChar2);
        checkCharacter(testChar3);
    }
    public static void checkCharacter(char ch) {
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet letter.");
            return;
        }
        char lowerCh = Character.toLowerCase(ch);
           switch (lowerCh) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("'" + ch + "' is a Vowel.");
                break;
            default:
                System.out.println("'" + ch + "' is a Consonant.");
        }
    }
}