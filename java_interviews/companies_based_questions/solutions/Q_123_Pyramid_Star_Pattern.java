package java_interviews.companies_based_questions.solutions;

public class Q_123_Pyramid_Star_Pattern {
    public static void main(String args[]){
        int N=5;

        System.out.println("Pyramid Pattern for N = " + N + ":\n");
        printPyramid(N);
    }

    public static void printPyramid(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                   System.out.print("* ");
            }
              System.out.println();
        }
        
    }
}
