package java_interviews.companies_based_questions.solutions;

public class Q_119_Sum_Of_AP_Recursion {
    public static void main(String args[]){
        int a=2;
        int d=3;
        int N=4;

        System.out.println("The sum of the first " + N +
         " terms of the AP is: \n" + sumOfAP(a, d, N));
    }

    public static int sumOfAP(int a,int d,int N){
        if(N==1){
            return a;
        }

        return a+ sumOfAP(a+d, d, N-1);
    }
}
