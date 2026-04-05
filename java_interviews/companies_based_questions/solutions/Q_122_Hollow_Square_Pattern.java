package java_interviews.companies_based_questions.solutions;
public class Q_122_Hollow_Square_Pattern {
    public static void main(String args[]){
        int N = 5;
		System.out.println("Hollow Square Pattern for N = " + N + ":\n");
		printHollowSquare(N);
    }
    public static void printHollowSquare(int N){


        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                if( i==0 || i==N-1 || j==0 || j == N-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}

