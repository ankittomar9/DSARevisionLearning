package java_interviews.companies_based_questions.solutions;

public class Q_117_Nth_Term_AP_Recursion {
    public static void main(String args[]){
        int a=2;
        int d=3;
        int N=4;

        System.out.println("The " + N + "th term of the AP is: " + nthTermAP(a, d, N));
    }
    public static int nthTermAP(int a,int d,int N){
        if(N==1){
            return a;
        }

        // int result = d + nthTermAP(a,d,N-1); // this is wrong
        // return result;

        return d + nthTermAP(a, d, N - 1);
    }
}
