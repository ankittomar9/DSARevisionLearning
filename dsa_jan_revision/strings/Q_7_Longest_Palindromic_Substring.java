package dsa_jan_revision.strings;

public class Q_7_Longest_Palindromic_Substring {
    static int maxLen=0;
    static int start=0;
    public static void main(String args[]){
        //String str1="babad";  //cbbd,a,ac,racecar
        String str="forgeeksskeegfor";
        System.out.println("Original String : \n"+str);
        maxLen=0; start=0;

        for(int i=0;i<str.length();i++){
            expandHelper(str, i, i); // for ODD
            expandHelper(str, i, i+1); // For even
        }
         System.out.println("Longest Palindrome: " 
         + str.substring(start, start + maxLen));
    }

    public static void expandHelper(String str,int left,int right){

        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        int currentLength=right-left-1;

        if (currentLength > maxLen) {
            maxLen = currentLength;
            start = left + 1;
        }
    }
}
