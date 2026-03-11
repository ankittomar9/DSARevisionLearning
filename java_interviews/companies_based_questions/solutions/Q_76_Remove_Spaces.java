package java_interviews.companies_based_questions.solutions;

public class Q_76_Remove_Spaces {
    public static void main(String args[]){
        String myString="Java Stream Programming";

        System.out.println("Original String : \n" +myString);
        String resultString = removeSpaces(myString);
          System.out.println("Removed Spaces String : \n" +resultString);
    }
        public static String removeSpaces(String str){
            if(str==null || str.isEmpty()){
                return str;
            }

            StringBuilder sb=new StringBuilder();

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch!=' '){
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
}
