package java_interviews.companies_based_questions.solutions;

public class Q_121_2_Leading_Spaces_Right_Pyramid {
    public static void main(String args[]){
        int N=6;
        halfPyramidPrinter(N);
    }
    public static void halfPyramidPrinter(int N){
        // i is for row  and j is for space
        for(int i=1;i<=N;i++){

            for(int j=1;j<=N-i;j++){

                    System.out.print(" ");
                
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
