package java_interviews.companies_based_questions.solutions;

public class Q_80_Highest_Occurring_Character {
    public static void main(String args[]){
        String s1="success";
        String s2="java programming";

        System.out.println("String : "+s1+ " -> Max Char :  "+findMaxChar(s1));
         System.out.println("String : "+s2+ " -> Max Char :  "+findMaxChar(s2));
    }
    public static char findMaxChar(String str){
        if(str==null || str.length()==0){
            throw new IllegalArgumentException("String cannot be empty");}
       
        int freq[]= new int[256];
        int maxFreq=-1;
        char maxChar=' ';
    
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

             freq[ch]++;
             if(freq[ch]>maxFreq){
                maxFreq =freq[ch];
                maxChar=ch;
             }
        }
        return maxChar;
    }
}
