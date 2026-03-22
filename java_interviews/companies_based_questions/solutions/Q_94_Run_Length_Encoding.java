package java_interviews.companies_based_questions.solutions;

public class Q_94_Run_Length_Encoding {
    public static void main(String args[]){
        String str1="aaabbbcc";
        String str2="wwoooow";
        String str3="a";
         System.out.println("Compressed '" + str1 + "': " + compressString(str1));
        System.out.println("Compressed '" + str2 + "': " + compressString(str2));
        System.out.println("Compressed '" + str3 + "': " + compressString(str3));
    }

    public static String compressString(String str){
        if(str==null || str.isEmpty()){return "";}
    
        StringBuilder sb=new StringBuilder();
        int count=1;

          for (int i=0; i<str.length(); i++) {
            if(i==str.length()-1 || str.charAt(i)!= str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(count);
                count=1;
            }else{
                count++;
            }
          }
          return sb.toString();
    }
}
