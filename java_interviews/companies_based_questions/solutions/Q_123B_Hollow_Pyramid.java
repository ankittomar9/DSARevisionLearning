package java_interviews.companies_based_questions.solutions;

public class Q_123B_Hollow_Pyramid {
    public static void main(String args[]){
        int N=5;
        printHollowPyramid(N);
    }
    public static void printHollowPyramid(int N){
        
          for(int row=0; row<N; row++){
            for(int star=0; star<(N-row); star++){
                System.out.print("*");
            }
            for(int space=0; space<2*row; space++){
                System.out.print(" ");
            }
            for(int star=0; star<(N-row); star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
