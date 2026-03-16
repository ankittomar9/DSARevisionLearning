package java_interviews.companies_based_questions.solutions;

public class Q_88_Longest_Word {
    public static void main(String args[]){
        String str1="Learning programming in Java";
         String str2=" The quick   brown fox ";

        System.out.println("String: " + str1 + " -> Longest: \n" 
        + findLongestWord(str1) + " ");
        System.out.println("String: " + str2 + " -> Longest: \n" 
        + findLongestWord(str2) + " ");
    }
    public static String findLongestWord(String str){
        if(str == null || str.trim().isEmpty() ) return "";

        String words[]= str.trim().split("\\s+");

        int maxLength=0;
        String longestWord="";

         for (String word : words) {
                if (word.length() >maxLength){
                    maxLength=word.length();
                    longestWord =word;
                }
         }
         return longestWord;
    }
}