package java_interviews.companies_based_questions.solutions;

public class Q_103_Factorial_Using_Recursion {
    public static void main(String args[]){
        int n1=6;
        long result=factorialHelper(n1);
        System.out.println("Factorial of "+n1+ " is : \n"+result);

        int n2=0;
        long result2=factorialHelper(n2);
        System.out.println("Factorial of "+n2+ " is : \n"+result2);

        int n3=10;
        long result3=factorialHelper(n3);
        System.out.println("Factorial of "+n3+ " is : \n"+result3);
        
    }
    public static long factorialHelper(int n){
        if (n<0) {
    throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(n==0){  return 1; }
        if(n==1){ return 1;}

        long factorial=factorialHelper(n-1)*n;
        return factorial;

    }
}
