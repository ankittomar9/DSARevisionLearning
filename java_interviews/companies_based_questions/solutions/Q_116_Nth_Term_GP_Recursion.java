package java_interviews.companies_based_questions.solutions;

public class Q_116_Nth_Term_GP_Recursion {
    public static void main(String args[]){
        int a=2;
        int r=3;
        int N=4;

        System.out.println("The " + N + "th term of the GP is: " + nthTermGP(a, r, N));

    }
    public static long nthTermGP(int a,int r,int N){
        if(N==1){
            return a;
        }

        return r*nthTermGP(a, r, N-1);
    }
}
