package java_interviews.companies_based_questions.solutions;

public class Q_108_LCM_Recursion {
    public static void main(String args[]){
        int a1=4, b1=6;
        int a2=5, b2=7;

         System.out.println("LCM of " + a1 + " and " + b1 + " is: "
          + findLCM(a1, b1));
        System.out.println("LCM of " + a2 + " and " + b2 + " is: "
         + findLCM(a2, b2));
    }
    public static long findLCM(int a,int b){
        long gcdResult=findGCD(a,b);
        long result=Math.abs(a*b)/gcdResult;
        return result;
    }
    public static long findGCD(int a,int b){
        if(b==0){return a;}
        long gcd=findGCD(b,a%b);
        return gcd;
    }
}
