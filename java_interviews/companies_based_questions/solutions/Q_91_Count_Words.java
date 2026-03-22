package java_interviews.companies_based_questions.solutions;
public class Q_91_Count_Words {
    public static void main(String args[]){
        String str1= "java Programming Streams";
          String str2= "java Programming Streams Lambdas";
           String str3= "java Functional interface Lambda Learning";
        System.out.println("Word Count : "+ countWords(str1));
        System.out.println("Word Count : "+ countWords(str2));
        System.out.println("Word Count : "+ countWords(str3));
    }
    public static int countWords(String str ){
        if(str==null || str.isEmpty()){return 0;}
        int count=0;
        boolean inWord=false;

         for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
            
        if(ch== ' ' || ch=='\t' || ch=='\n'){
            inWord=false;
        }
                else{
                    if(!inWord){
                        count++;
                        inWord=true;
                    }
                }
        }
        return count;
    }
}
