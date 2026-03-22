package java_interviews.companies_based_questions.solutions;

public class Q_93_Longest_Common_Prefix {
    public static void main(String args[]){
        String str1[]={"flower","flow","flight"};
        String str2[]={"dog","racecar","car"};
        String str3[]={"ab","a"};

        System.out.println("Prefix 1: '" + longestCommonPrefix(str1) + "'");
        System.out.println("Prefix 2: '" + longestCommonPrefix(str2) + "'");
        System.out.println("Prefix 3: '" + longestCommonPrefix(str3) + "'");
    }
    public static String longestCommonPrefix(String str[]){
        if(str==null || str.length==0){return "";}

        String reference=str[0];
        
        for(int i=0;i<reference.length();i++){
            char ch=reference.charAt(i);
            
            for(int j=1;j<str.length;j++){
                if(i== str[j].length() || str[j].charAt(i) !=ch){
                return reference.substring(0,i);
            }
            }            
        }   
            return reference;
    }
}
