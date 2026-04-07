package java_interviews.companies_based_questions.solutions;

public class Q_127_Right_Triangle_Number_Pattern {
    public static void main(String args[]){
        int N = 5; 
        System.out.println("Right Triangle Number Pattern \n for N = " + N + ":\n");
        
        printNumberTriangle(N);
    }
    public static void printNumberTriangle(int N){

        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){

                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
