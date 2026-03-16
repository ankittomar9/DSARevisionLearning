package java_interviews.companies_based_questions.solutions;

public class Q_85_Reverse_Each_Word {
    public static void main(String args[]){
       String str="Learn Java Programming";
        
       System.out.println("Original String : \n"+str);
       String result=reverseEachWord(str);
       System.out.println("Reversed Words : \n"+result);
       
    }
    public static String reverseEachWord(String str){
        if(str==null || str.length()==0){System.out.println("empty String"); return str;}
   
        String words[]=str.split(" ");
        
        StringBuilder result=new StringBuilder();

        for(int i=0;i<words.length;i++){
            StringBuilder wordBuilder=new StringBuilder(words[i]);
            wordBuilder.reverse();

            result.append(wordBuilder);

            if(i<words.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }    
}
