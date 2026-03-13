package java_interviews.companies_based_questions.solutions;
public class Q_83_Remove_Chars_From_Second_String {
    public static void main(String args[]){
        String str1="computer";
        String str2="cat";

        System.out.println("String 1 : "+str1);
        System.out.println("String 2  : "+str2);
                System.out.println("Result: " + removeBlackListedChars(str1, str2));
    }
    public static String removeBlackListedChars(String str1,String str2){
        if(str1==null || str1.isEmpty()){return str1;}
          if(str2==null || str2.isEmpty()){return str2;}
    
            boolean[] blacklist=new boolean[256];

            for(int i=0;i<str2.length();i++){
               char ch=str2.charAt(i);
               blacklist[ch]=true; 
            }
            StringBuilder sb= new StringBuilder();

            for(int i=0;i<str1.length();i++){
               char ch=str1.charAt(i);
               if(!blacklist[ch]){
                sb.append(ch);
               }
            }
            return sb.toString();
        }
}
