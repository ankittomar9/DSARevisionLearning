package java_interviews.companies_based_questions.solutions;

public class Q_107_GCD_Recursion {
    public static void main(String args[]){
        int a1=40;int b1=15;
        System.out.println("GCD of " + a1 + " and " + b1 + " is: " + gcdHelper(a1, b1));

        int a2 = 15, b2 = 20; //  'a' is smaller than 'b'
            System.out.println("GCD of " + a2 + " and " + b2 + " is: " + gcdHelper(a2, b2));  

            int a3=48, b3=18;
                System.out.println("GCD of " + a3 + " and " + b3 + " is: " + gcdHelper(a3, b3));  
    }
    public static long gcdHelper(int a,int b){
        if(b==0) return a;

        long gcd=gcdHelper(b,a%b);
        return gcd;
    }
}
