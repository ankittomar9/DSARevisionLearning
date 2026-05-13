package DSARevisionLearning.arrays;

public class Q_80_1_2_Subsequence {
    public static void main(String[] args) {
        System.out.println("String: bcaba -> Min Subsequence: " + SubsequenceHelper("bcaba"));
        System.out.println("String: edcba -> Min Subsequence: " + SubsequenceHelper("edcba"));
        System.out.println("String: ab -> Min Subsequence: " + SubsequenceHelper("ab"));
    }
    public static String SubsequenceHelper(String str){
        int n=str.length();
        if(str==null || str.length()==0){System.out.println("Empty or null string");return "0";}
    
        char minChar1='z'+1;
        int minIdx=-1;
        
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)<minChar1){
                minChar1=str.charAt(i);
                minIdx=i;
            }
        }
        char minChar2='z'+1;

        for(int i=minIdx +1 ;i<n;i++){
            if(str.charAt(i)< minChar2){
                minChar2=str.charAt(i);
            }
        }
        return ""+ minChar1+minChar2;
    }
}
