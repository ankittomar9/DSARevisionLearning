package java_interviews.companies_based_questions.solutions;

public class Q_121_1_Skip_Even_Numbers_Half_Pyramid {
    public static void main(String args[]){
        int N=9;
        halfPyramidPrinter(N);
    }
    public static void halfPyramidPrinter(int N){

        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){

                if(j%2!=0){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
