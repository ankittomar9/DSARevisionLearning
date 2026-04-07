package java_interviews.companies_based_questions.solutions;
public class Q_124_Inverted_Pyramid_Pattern {
    public static void main(String args[]){
        int N=5;

        System.out.println("Inverted Pyramid Pattern for N = " + N + ":\n");
       
        printInvertedPyramid(N);
    }
    public static void printInvertedPyramid(int N){
        for(int i=N;i>=0;i--){

            
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

