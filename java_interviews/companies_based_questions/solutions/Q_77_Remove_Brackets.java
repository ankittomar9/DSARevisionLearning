package java_interviews.companies_based_questions.solutions;

public class Q_77_Remove_Brackets {
    public static void main(String args[]){
        String s1="(a+b)=c";
        String s2="[(x+y)*{z-1}]";

         System.out.println("Original: " + s1);
        System.out.println("Cleaned:  " + removeBrackets(s1));
        
        System.out.println("Original: " + s2);
        System.out.println("Cleaned:  " + removeBrackets(s2));
    }
    public static String removeBrackets(String str){
        if(str==null || str.isEmpty()){return str;}

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch !='{' && ch !='}' && 
            ch !='(' && ch !=')' && 
            ch !='[' && ch !=']'){
                sb.append(ch);
            }    
        }
        return sb.toString();
    }
}
