package java_interviews.companies_based_questions.solutions;

public class Q_129_Pascals_Triangle {
    public static void main(String args[]){
        int N=5;
        System.out.println("Pascal's Triangle for N = " + N + ":\n");
        printPascalTriangle(N);
    }
    public static void printPascalTriangle(int N){
        for(int i=1;i<=N;i++){

            for(int j=1;j<N-i;j++){
                System.out.print(" ");
            }
            int val=1;

            for(int j=1;j<=i;j++){
                System.out.print(val +" ");
            
                val=val*(i-j)/j;
            }
            System.out.println();
        }
    }
}
