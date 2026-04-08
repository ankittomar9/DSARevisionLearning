package java_interviews.companies_based_questions.solutions;

public class Q_128_Floyds_Triangle {
    public static void main(String args[]){
        int N=5;
    System.out.println("Floyd's Triangle for N = " + N + ":\n");
        printFloydTriangle(N);
    }

    public static void printFloydTriangle(int N){
        int count=1;

        for(int i=0;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

}
