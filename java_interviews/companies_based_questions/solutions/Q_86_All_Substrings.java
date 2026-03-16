package java_interviews.companies_based_questions.solutions;

public class Q_86_All_Substrings {
    public static void main(String args[]){
        String str="abc";
        System.out.println("String : \n"+str);
           System.out.println("All Possible substring : ");
           printSubstring(str);

    }
    public static void printSubstring(String str){
        if(str==null ||str.isEmpty()) return;
        int n=str.length();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=str.substring(i,j);
                System.out.println(sub);
            }
        }
    }
}
