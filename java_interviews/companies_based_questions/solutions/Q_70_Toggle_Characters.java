package java_interviews.companies_based_questions.solutions;
public class Q_70_Toggle_Characters {
    public static void main(String args[]) {
        String input = "HeLLo 123!";
        
        System.out.println("Original String: " + input);
        String toggled = toggleCase(input);
        System.out.println("Toggled String:  " + toggled);
    }
    public static String toggleCase(String str) {
        if (str == null || str.isEmpty()) return str;

        char[] chars = str.toCharArray();
     
        for (int i=0; i<chars.length; i++) {
            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') {
                chars[i] = (char) (ch + 32);
            } 
            else if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) (ch - 32);
            }
        }
        return new String(chars);
    }
}