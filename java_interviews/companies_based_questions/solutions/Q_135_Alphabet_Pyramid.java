package java_interviews.companies_based_questions.solutions;
public class Q_135_Alphabet_Pyramid {
    public static void main(String args[]){
        int N=5;
        System.out.println("Alphabet Pyramid for N = " + N + ":\n");
        
        printAlphabetPyramid(N);
    }
    public static void printAlphabetPyramid(int N){

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               System.out.print((char) ('A' + k - 1));
            }
            for(int k=i-1;k>=1;k--){
                 System.out.print((char) ('A' + k - 1));
            }
            System.out.println();
        }
    }
}
