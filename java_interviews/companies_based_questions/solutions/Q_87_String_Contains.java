package java_interviews.companies_based_questions.solutions;
public class Q_87_String_Contains {
    public static void main(String args[]){
        String haystack1 ="hello world";
        String needle1= "world";
        String haystack2 ="programming";
        String needle2= "gram";    

        System.out.println("Does " + haystack1 + " contain " + needle1 + "? "
         + contains(haystack1, needle1));
        System.out.println("Does " + haystack2 + " contain " + needle2 + "? "
         + contains(haystack2, needle2));
    }
    public static boolean contains(String haystack,String needle){
        if(needle==null || needle.isEmpty()) return true;
        if(haystack==null || haystack.length()<needle.length()) return false;
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j==m){  
                return true;
            }
        }
        return false;
    }
}
