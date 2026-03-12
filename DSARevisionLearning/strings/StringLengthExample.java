package DSARevisionLearning.strings;

public class StringLengthExample {
    public static void main(String[] args) {
        // Regular ASCII character
        String str1 = "Hello";
        System.out.println("String: " + str1);
        System.out.println("length(): " + str1.length());
        System.out.println("Actual characters: " + str1.codePointCount(0, str1.length()));
        System.out.println();
        
        // String with emoji (outside BMP)
        String str2 = "Hello😀";
        System.out.println("String: " + str2);
        System.out.println("length(): " + str2.length()); // Returns 7, not 6!
        System.out.println("Actual characters: " + str2.codePointCount(0, str2.length())); // Returns 6
        System.out.println();
        
        // Multiple emojis
        String str3 = "😀😃😄";
        System.out.println("String: " + str3);
        System.out.println("length(): " + str3.length()); // Returns 6
        System.out.println("Actual characters: " + str3.codePointCount(0, str3.length())); // Returns 3
    }
}