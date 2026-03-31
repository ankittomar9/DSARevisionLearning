package java_interviews.companies_based_questions.solutions;

public class Q_114_Check_Palindrome_String_Using_Recursion {
    public static void main(String args[]){
       String s1="racecar";
        String s2="hello";
        String s3="a";
        
        System.out.println("Is '" + s1 + "' a palindrome? " + isPalindrome(s1));
        System.out.println("Is '" + s2 + "' a palindrome? " + isPalindrome(s2));
        System.out.println("Is '" + s3 + "' a palindrome? " + isPalindrome(s3));
    }
    public static boolean isPalindrome(String s1){
        if(s1==null)return false;

        return isPlaindromicHelper(s1, 0, s1.length()-1);
    }

    public static boolean isPlaindromicHelper(String str,int left,int right){
        if(left>=right){
            return true;
        }

        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return isPlaindromicHelper(str, left+1, right-1);

    }
}
