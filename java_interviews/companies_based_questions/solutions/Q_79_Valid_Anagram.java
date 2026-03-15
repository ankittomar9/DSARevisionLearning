package java_interviews.companies_based_questions.solutions;
public class Q_79_Valid_Anagram {
    public static void main(String args[]) {
        String s1 = "listen";
        String t1 = "silent";
        
        String s2 = "rat";
        String t2 = "car";
        
        System.out.println("Are '" + s1 + "' and '" + t1 + "' anagrams ? " + isAnagram(s1, t1));
        System.out.println("Are '" + s2 + "' and '" + t2 + "' anagrams ? " + isAnagram(s2, t2));
    }
    public static boolean isAnagram(String s, String t) {
    
        if (s==null || t==null || s.length()!=t.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--; 
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false; 
            }
        }
        return true;
    }
}