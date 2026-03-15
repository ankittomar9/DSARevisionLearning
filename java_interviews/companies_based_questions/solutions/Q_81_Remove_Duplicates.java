package java_interviews.companies_based_questions.solutions;

public class Q_81_Remove_Duplicates {
    public static void main(String args[]){
        String s1="programming";
        System.out.println("Original String : "+s1);

        System.out.println("modified String : "+removeDuplicates(s1));
    }   
    public static String removeDuplicates(String str){
        if(str==null || str.length()==0){
            throw new IllegalArgumentException("String can't be empty");
        }

        StringBuilder sb=new StringBuilder();
        boolean[] seen =new boolean[256];

        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);

            if(!seen[ch]){
                sb.append(ch);
                seen[ch]=true;
            }
        }
        return sb.toString();
    }
    
}
