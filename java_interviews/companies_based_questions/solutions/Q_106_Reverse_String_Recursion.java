package java_interviews.companies_based_questions.solutions;

public class Q_106_Reverse_String_Recursion {
    public static void main(String args[]){
        String str1="hello";
        String str2="Java";

        System.out.println("Original: " + str1 + " | Reversed: " 
        + reverseString(str1));
        System.out.println("Original: " + str2 + " | Reversed: " 
        + reverseString(str2));
    }

    public static String reverseString(String str){
        if(str==null ||str.length()<=1){ return str;}

        String result=reverseString(str.substring(1))+str.charAt(0);

        return result;
    }
}
