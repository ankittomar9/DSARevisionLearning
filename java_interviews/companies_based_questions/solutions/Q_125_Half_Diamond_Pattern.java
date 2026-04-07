package java_interviews.companies_based_questions.solutions;

public class Q_125_Half_Diamond_Pattern {
    public static void main(String args[]){
        int N=5;
        System.out.println("Half Diamond Pattern for N = " + N + ":\n");
        printHalfDiamond(N);
    }
    public static void printHalfDiamond(int N){
         
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=N-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
