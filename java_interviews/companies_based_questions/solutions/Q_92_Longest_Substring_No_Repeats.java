package java_interviews.companies_based_questions.solutions;
public class Q_92_Longest_Substring_No_Repeats {
    public static void main(String args[]){
        String str1="abcabcbb";
        String str2="pwwkew";
        System.out.println("Longest Substring in '" + str1 + "': " 
        + lengthOfLongestSubstring(str1));
        System.out.println("Longest Substring in '" + str2 + "': " 
        + lengthOfLongestSubstring(str2));
    }
    public static int  lengthOfLongestSubstring(String str){
        if(str ==null || str.isEmpty()){return 0;}

        boolean seen[]=new boolean[256];
        int maxLength=0;        int left=0;

        for(int right=0;right<str.length();right++){
            char currentChar=str.charAt(right);
        
            while(seen[currentChar]){
                char leftChar=str.charAt(left);
                seen[leftChar]=false;
                left++;
            }
            seen[currentChar]=true;
            int newLength=right-left+1;
            maxLength=Math.max(maxLength, newLength);
        }
        return maxLength;
    }
}
