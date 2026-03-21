package java_interviews.companies_based_questions.solutions;
public class Q_88_Longest_Palindromic_Substring {
    public static void main(String args[]){
        String s1="babad";          String s2="cbbd";
         System.out.println("Longest in '" + s1 + "': " + longestPalindrome(s1));
        System.out.println("Longest in '" + s2 + "': " + longestPalindrome(s2));

    }
    public static String longestPalindrome(String str){
        if(str==null || str.length()<1){return "";}
        int start=0;int end=0;
        for(int i=0;i<str.length();i++){

            int len1=expandFromCenter(str,i,i);
                int len2=expandFromCenter(str,i,i+1);
        
                int len=Math.max(len1,len2);
                if(len>end-start){
                    start=i-(len-1)/2;
                    end=i+len/2;
                }
             } 
             return str.substring(start,end+1);
    }
    public static int expandFromCenter(String str ,int left,int right){
        while(left>=0 && right< str.length() && str.charAt(left)== str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
