package java_interviews.companies_based_questions.solutions;
public class Q_84_Reverse_Words {
    public static void main(String args[]){
        String str=" The sky is blue";
        System.out.println("Original String : \n"+ str);
        String result=reversedWords(str);
        System.out.println("Reversed Words : \n"+ result);
    }
    public static String reversedWords(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder sb= new StringBuilder();
        int n=str.length();
        int i=n-1;
       while (i>=0) {
            while (i>=0 && str.charAt(i)==' ') {
                i--;
            }
            if (i < 0) break; 
            int j = i;
            while (i >= 0 && str.charAt(i)!=' ') {
                i--;
            }       
            if (sb.length()>0) {
                sb.append(" ");
            }
            sb.append(str.substring(i + 1, j + 1));
        }
        return sb.toString();
    }   }
