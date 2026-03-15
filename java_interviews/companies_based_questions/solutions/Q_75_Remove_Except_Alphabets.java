package java_interviews.companies_based_questions.solutions;

public class Q_75_Remove_Except_Alphabets {
    public static void main(String args[]){
        String dirtyString="Java12% *&^%# Programming";

       System.out.println("Original String : \n"+dirtyString);
        String result=  cleanString(dirtyString);
         System.out.println("Cleaned String : \n"+result);

    }
    public static String cleanString(String str){
        if(str==null || str.isEmpty()){return str;}
    
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') ){
                sb.append(ch);
            }
        }
        return sb.toString();
    }  
}
