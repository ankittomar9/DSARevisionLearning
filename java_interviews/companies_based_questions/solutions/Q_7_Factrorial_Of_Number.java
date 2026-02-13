package java_interviews.companies_based_questions.solutions;

public class Q_7_Factrorial_Of_Number {
    public static void main(String args[]){
        int n=5;
        factorialCalculator(n);
    }

    public static void factorialCalculator(int n){
        int fact=1;
              //Method 1 Using For Loop
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of number is : "+fact);

        //Method 2 Using while Loop

        int factorial=1;
        int j=1;
        while(j<=n){
            factorial=factorial*j;
            j++;
        }
         System.out.println("Factorial of number is : "+fact);
    }
    
}
