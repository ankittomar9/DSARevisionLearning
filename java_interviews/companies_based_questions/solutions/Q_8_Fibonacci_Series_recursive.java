package java_interviews.companies_based_questions.solutions;

public class Q_8_Fibonacci_Series_recursive {
    public static void main(String args[]){
        int n=7;
         System.out.print("Fibonacci Series: ");
         for(int i=0;i<=n;i++){
              System.out.print(  fibonacciHelper(i)+" ");
        }
    }
    public static int fibonacciHelper(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

         return   fibonacciHelper(n-1)+fibonacciHelper(n-2);
    }
}
