package java_interviews.companies_based_questions.solutions;
public class Q_115_Prime_Number_Check_Using_Recursion {
    public static void main(String args[]){
        int n1=7;
        int n2=15;
        int n3=2;
        int n4=1;
        
        System.out.println("Is " + n1 + " prime? " + isPrime(n1));
        System.out.println("Is " + n2 + " prime? " + isPrime(n2));
        System.out.println("Is " + n3 + " prime? " + isPrime(n3));
        System.out.println("Is " + n4 + " prime? " + isPrime(n4));

    }
    public static boolean isPrime(int n){
        if(n<=1){return false;}
        return isPrimeHelper(n,2);
    }
    public static boolean isPrimeHelper(int n,int i){
        if(i*i>n){
            return true;
        }

        if(n%i==0){
            return false;
        }

        return isPrimeHelper(n,i+1);
    }
}
