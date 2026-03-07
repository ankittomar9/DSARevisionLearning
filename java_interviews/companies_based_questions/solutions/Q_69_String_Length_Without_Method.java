package java_interviews.companies_based_questions.solutions;

public class Q_69_String_Length_Without_Method {
    public static void main(String args[]) {
        String testStr = "FirstPrinciples";
        
        int length = findLength(testStr);
        System.out.println("The string is: '" + testStr + "'");
        System.out.println("Calculated Length: " + length);
    }
    public static int findLength(String str) {
        // Edge case for null strings to prevent NullPointerException
        if (str == null) return 0;
        int i=0;
        try {
           // we cross the threshold intentionally
            while (true) {
                // This will eventually fail when 'i' reaches the actual length
                str.charAt(i); 
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // We fell off the cliff! The catch block acts as our safety net.
            // The moment it breaks, 'i' holds the exact length of the string.
        }
        return i;
    }
}