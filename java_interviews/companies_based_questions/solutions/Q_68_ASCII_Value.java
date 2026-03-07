package java_interviews.companies_based_questions.solutions;

public class Q_68_ASCII_Value {
    public static void main(String args[]) {
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '0'; // Let's see what the number 0 is stored as!

        findASCII(ch1);
        findASCII(ch2);
        findASCII(ch3);
    }

    public static void findASCII(char ch) {
        // Explicitly cast the character to an integer important 
        int asciiValue = (int) ch;
        
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}