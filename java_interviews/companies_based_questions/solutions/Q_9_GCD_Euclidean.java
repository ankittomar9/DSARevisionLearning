package java_interviews.companies_based_questions.solutions;

public class Q_9_GCD_Euclidean {
    public static void main(String args[]){
        int a=20;int b=30;

        System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }

    public static int findGCD(int a,int b){
        while(b!=0){
            int remainder=a%b;

            a=b;
            b=remainder;
        }

        return a;
    }
}
