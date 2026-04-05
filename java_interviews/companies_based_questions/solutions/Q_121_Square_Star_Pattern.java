package java_interviews.companies_based_questions.solutions;

public class Q_121_Square_Star_Pattern {
    public static void main(String args[]){
        int N=5;
        System.out.println("Square Pattern for N = " + N + ":\n");
        
        printSquare(N);
    }
    public static void printSquare(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
