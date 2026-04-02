package java_interviews.companies_based_questions.solutions;

public class Q_118_Sum_Of_GP_Recursion {
     public static void main(String args[]){
        long a=2;
        long r=3;
        int N=4;

       System.out.println("The sum of the first " + N
        + " terms of the GP is: \n" + sumOfGP(a, r, N));
    }
    public static long sumOfGP(long a,long r,int N){
        if(N==1){
            return a;
        }

        // int result = r + nthTermAP(a,r,N-1); // 
        // return result;

        return a + sumOfGP(a*r, r, N - 1);
    }
}
