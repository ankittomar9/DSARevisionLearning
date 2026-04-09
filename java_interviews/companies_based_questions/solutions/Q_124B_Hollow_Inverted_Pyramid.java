package java_interviews.companies_based_questions.solutions;
public class Q_124B_Hollow_Inverted_Pyramid {
    public static void main(String args[]){
        int N=5;
        printHollowPyramid(N);
    }
    public static void printHollowPyramid(int n){
      for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                  System.out.print("*");
            }
            for(int j=1; j<=n-i; j++){
                  System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                  System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                 System.out.print("*");
        }
                  System.out.println();
         }
      }
}
    
