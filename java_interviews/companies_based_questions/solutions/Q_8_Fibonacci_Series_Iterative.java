package java_interviews.companies_based_questions.solutions;

public class Q_8_Fibonacci_Series_Iterative {
    public static void main(String args[]){
        /* Fibonacci  series is sum of previous two elements */
        int n=7;
        fibonacciSeriesHelper(n);

    }

    public static void fibonacciSeriesHelper(int n){
         int firstTerm=0; int secondTerm=1;
         System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for(int i=2;i<n;i++){
            int nextTerm=firstTerm+secondTerm;

             System.out.print(", "+nextTerm);

            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }

       
    }
    
}
