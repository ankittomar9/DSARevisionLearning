package java_interviews.companies_based_questions.solutions;

public class Q_123_2_Numeric_Inverted_Half_Pyramid {
    public static void main(String args[]){
        int N=5;
          System.out.println("Inverted Numeric Pyramid for N = " + N + ":\n");
        printInvertedNumericPyramid(N);
    }     
    public static void printInvertedNumericPyramid(int N){
        for(int i=N;i>=0;i--){

            
            for(int j=1;j<i;j++){
                if(j == i){
                   System.out.print(j);
               }else{
                  System.out.print(j + " ");
               }
            }
              System.out.println();
        }

        }       
}
