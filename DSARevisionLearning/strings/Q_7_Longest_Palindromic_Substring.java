package DSARevisionLearning.strings;

public class Q_7_Longest_Palindromic_Substring {
    static int maxLen=0;// tracks longest length
    static int start=0; // tracks where palindrome start
    public static void main(String args[]){
        String s="babad";
             maxLen = 0;
            start = 0;
            for(int i=0;i<s.length();i++){

                 expandHelper(s,i,i);// for ODD
                 expandHelper(s, i, i + 1); // for even
            }
            System.out.println("Longest Palindrome: " + s.substring(start, start + maxLen));
       
    }
    public static void  expandHelper(String s,int left ,int right){
        while(left>=0 && right<s.length()
             && s.charAt(left) == s.charAt(right)){

            left--;right++;
        }
        int currentLen=right-left-1;

        if (currentLen > maxLen) {
            maxLen = currentLen;
            start = left + 1;
        }
    }    
}
