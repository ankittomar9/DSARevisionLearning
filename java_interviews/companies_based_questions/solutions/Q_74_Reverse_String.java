package java_interviews.companies_based_questions.solutions;

public class Q_74_Reverse_String {
    public static void main(String args[]) {
        String myStr = "Java Programming";
        
        System.out.println("Original: " + myStr);
        String reversed = reverseString(myStr);
        System.out.println("Reversed: " + reversed);
    }
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left<right) {
            
            // The Classic Swap
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
}