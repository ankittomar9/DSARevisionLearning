package dsa_jan_revision.recursion;

public class Q_4_Factorial_of_number {
    public static void main(String[] args) {
        long n=6;
        System.out.println(" Factorial of "+n +" is :");
        long result= factorialHelper(n);
         System.out.println(" "+ result);
    }
    public static long factorialHelper(long n){
      if (n < 0) {
    throw new IllegalArgumentException
    ("Factorial is not defined for negative numbers.");
        }
        if(n<=1) return 1L;

        long result=n*factorialHelper(n-1);
        return result;
    }
}
