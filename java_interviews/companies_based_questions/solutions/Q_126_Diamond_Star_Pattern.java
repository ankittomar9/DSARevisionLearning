package java_interviews.companies_based_questions.solutions;
public class Q_126_Diamond_Star_Pattern {
    public static void main(String args[]){
        int N=5;
        System.out.println("Diamond Pattern for N = " + N + ":\n");
        printDiamond(N);
    }
    public static void printDiamond(int N){
        //First Half
          for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                   System.out.print("* ");
            }
              System.out.println();
        }
        //Second Half
       for(int i=N-2;i>=0;i--){
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
