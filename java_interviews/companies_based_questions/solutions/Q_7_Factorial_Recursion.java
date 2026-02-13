package java_interviews.companies_based_questions.solutions;

public class Q_7_Factorial_Recursion {
    public static void main(String args[]){
        int n=5;
        long result=factorialHelper(n);
        System.out.println("factorial of number : "+result);
    }

    public static long factorialHelper(int n){
        //base case 
         if(n<0){
            System.out.println("Factorial of Negative number is not defined"); return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
         // Main Logic
        long factorial=factorialHelper(n-1)*n;
        return factorial;
    }
    
}
