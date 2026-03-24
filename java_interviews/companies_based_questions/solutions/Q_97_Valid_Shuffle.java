package java_interviews.companies_based_questions.solutions;
public class Q_97_Valid_Shuffle {
    public static void main(String args[]){
        String s1="abc";
        String s2="def";
         String validResult = "dabecf";
        String invalidResult = "abcefd"; 
         System.out.println("Is '" + validResult + "' valid? " 
         + isValidShuffle(s1, s2, validResult));
        System.out.println("Is '" + invalidResult + "' valid? " 
        + isValidShuffle(s1, s2, invalidResult));
    }
    public static boolean isValidShuffle(String s1,String s2,String result){
        if(s1.length() +s2.length() != result.length()){return false;}
    
        int i=0;        int j=0;        int k=0;
        while(k<result.length()){
            if(i<s1.length() && s1.charAt(i)== result.charAt(k)){
                i++;
            }else if(j<s2.length() && s2.charAt(j)== result.charAt(k)){
                j++;
            }
            else{
                return false;
            }
            k++;
        }
        return true;   
    }
}
